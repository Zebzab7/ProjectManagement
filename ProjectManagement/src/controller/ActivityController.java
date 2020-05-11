package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import project_management.Activity;
import project_management.ItemTimeManager;
import project_management.ManagementApp;
import project_management.State;
import runner_class.Main;

public class ActivityController implements Initializable {
	@FXML
	private Label lblActivityName;
	@FXML
	private Label lblWorkerCounter;
	@FXML
	private Label lblET;
	@FXML
	private Label lblWorkedHours;
	@FXML
	private TableView<ActivityUserTable> table;
	@FXML
	private TableColumn<ActivityUserTable, Integer> id;
	@FXML
	private TableColumn<ActivityUserTable, String> name;
	@FXML
	private TableColumn<ActivityUserTable, Integer> hours;
	@FXML
	private Slider slider;
	@FXML
	private Label lblSlider;
	@FXML
	private TextField txtTime;
	@FXML
	private TextField txtTime1;
	@FXML
	private Label lblStart;
	@FXML
	private Label lblEnd;
	@FXML
	private Label lblOverdue;
	
	
	public ObservableList<ActivityUserTable> list;
	private ArrayList<Integer> accHours;
	private ManagementApp managementApp;
	private double sliderValue = 0;
	private double lastSliderVal = 0;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		slider.setOnMouseReleased(event -> {
			sliderValue = lastSliderVal;
			slider.setValue(sliderValue);
			lblSlider.setText("Hours: "+sliderValue);
		});
		
		slider.valueProperty().addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable arg0) {
				lastSliderVal = sliderValue;
				sliderValue = Math.round(slider.getValue()*2) / 2.0;
				lblSlider.setText("Hours: "+sliderValue);
			}
		});
	}
		
	public void initialize(Activity a) throws Exception {
		this.managementApp = Main.getManagementApp();
		managementApp.getState().currentProject();
		this.accHours = managementApp.getState().currentActivity().getAccumulatedHours();
		 
		id.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, String>("name"));
		hours.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, Integer>("hours"));
		
		updateTable();
		updateLabels();
		updateTimeLabels();
	}
	
	public void SetTime(ActionEvent event) throws Exception {
		int[] start = splitTimeInput(txtTime.getText()+"/");
		int[] end = splitTimeInput(txtTime1.getText()+"/");
		
		System.out.println(Arrays.toString(start));
		System.out.println(Arrays.toString(end));
		
		State.getInstance().currentActivity().getTimeManager().setStartTime(start[2], start[1], start[0], State.getInstance().currentActivity());
		State.getInstance().currentActivity().getTimeManager().setEndTime(end[2], end[1], end[0], State.getInstance().currentActivity());
		updateTimeLabels();
	}

	
	private void updateTimeLabels() throws Exception {
		ItemTimeManager t = State.getInstance().currentActivity().getTimeManager();
		System.out.print(t.containsTimeSpecifications());
		if(t.containsTimeSpecifications()) {
			System.out.println(t.getStartTime().get(Calendar.MONTH));
			
			lblStart.setText("Start time: "+"week "+t.getStartWeek()+", "+getMonth(t.getStartTime().get(Calendar.MONTH)));
			lblEnd.setText("End time: "+"week "+t.getEndWeek()+", "+getMonth(t.getEndTime().get(Calendar.MONTH)));
			lblOverdue.setText("Overdue: "+t.deadlineOverdue());
		} else {
			lblStart.setText("Start time: not defined");
			lblEnd.setText("End time: not defined");
			lblOverdue.setText("Overdue: false");
		}
	}
	
	public String getMonth(int i) {
		String[] months = new String[] {"January", "February", "Marts", "April", "May", "Juni","July","August","September","October","November","December"};
		return months[i];
	}
	
	public int[] splitTimeInput(String date) {
		char[] chars = date.toCharArray();
		String[] dayMonthYear = new String[] {"","",""};
		int[] ddmmyy = new int[] {0,0,0};
		int count = 0;
		
		for(char c:chars) {
			if(c == '/') {
				ddmmyy[count]=Integer.parseInt(dayMonthYear[count]);
				count++;
			} else {
				dayMonthYear[count] += c;
			}
		}
		
		return ddmmyy;
	}
	
//	ActionMethods
	public void LogOut(ActionEvent event) {
		try {
			if(managementApp.Logout()) {
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Worker");
				FXMLLoader loader = new FXMLLoader();
				Parent root = loader.load(getClass().getResource("../view/LoginRegister.fxml").openStream());
				Scene scene = new Scene(root,400,400);
				scene.getStylesheets().add(getClass().getResource("../runner_class/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void LogTime(ActionEvent event) {
		try {
			managementApp.getState().currentActivity().addHoursToWorker((int) (sliderValue*2));
			managementApp.addHours((int) (sliderValue*2));
			
			
		} catch(Exception e) {}
		
		updateTable();
		updateLabels();
	}

	private void updateTable() {
		list = FXCollections.observableArrayList();
		for(int i = 0; i < accHours.size(); i++) {
			list.add(new ActivityUserTable(i,managementApp.getState().currentActivity().getWorkerList().get(i).getUsername(),accHours.get(i)/2.0));
		}
		
		table.setItems(list);
	}

	private void updateLabels() {
		lblActivityName.setText("Activity: "+managementApp.getState().currentActivity().getName());
		lblWorkerCounter.setText("Worker count: "+managementApp.getState().currentActivity().getWorkerList().size());
		lblWorkedHours.setText("Worked hours: "+managementApp.getState().currentActivity().getHours()/2.0);
	}
	
}
