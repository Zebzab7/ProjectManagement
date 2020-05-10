package controller;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import project_management.Activity;
import project_management.ManagementApp;
import project_management.Project;
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
	
	public ObservableList<ActivityUserTable> list;
	private ArrayList<Integer> accHours;
	private Activity activity;
	private Project project;
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
		
	public void initialize(Activity a) {
		this.managementApp = Main.getManagementApp();
		this.activity = managementApp.getState().currentActivity();
		this.project = managementApp.getState().currentProject();
		this.accHours = activity.getAccumulatedHours();
		 
		id.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, String>("name"));
		hours.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, Integer>("hours"));
		
		updateTable();
		
		
		updateLabels();
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
			activity.addHoursToWorker((int) (sliderValue*2));
			managementApp.addHours((int) (sliderValue*2));
			
			
		} catch(Exception e) {}
		
		updateTable();
		updateLabels();
	}

	private void updateTable() {
		list = FXCollections.observableArrayList();
		for(int i = 0; i < accHours.size(); i++) {
			list.add(new ActivityUserTable(i,activity.getWorkerList().get(i).getUsername(),accHours.get(i)/2.0));
		}
		
		table.setItems(list);
	}

	private void updateLabels() {
		lblActivityName.setText("Activity: "+activity.getName());
		lblWorkerCounter.setText("Worker count: "+activity.getWorkerList().size());
		lblWorkedHours.setText("Worked hours: "+activity.getHours()/2.0);
	}
	
}
