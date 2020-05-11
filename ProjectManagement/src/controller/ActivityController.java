package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import project_management.Activity;
import project_management.ManagementApp;
import project_management.Worker;
import runner_class.Main;

public class ActivityController {
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
	private TextField txtHours;
	
	public ObservableList<ActivityUserTable> list;
	private ArrayList<Integer> accHours;
	private Activity activity;
	private ArrayList<Worker> workers;
	private ManagementApp managementApp;
	
	
	public void initialize(Activity a) {
		this.managementApp = Main.getManagementApp();
		this.activity = managementApp.getState().currentActivity();
		
		this.accHours = activity.getAccumulatedHours();
		
		id.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, String>("name"));
		hours.setCellValueFactory(new PropertyValueFactory<ActivityUserTable, Integer>("hours"));
		
		updateTable();
		
		
//		updateLabels();
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
		String textfieldInput = txtHours.getText();
		try {
			int time = Integer.parseInt(textfieldInput);
			activity.addHours(time/2);
			updateTable();
		} catch(Exception e) {}
	}

	private void updateTable() {
		list = FXCollections.observableArrayList();
		for(int i = 0; i < accHours.size(); i++) {
			list.add(new ActivityUserTable(i,activity.getWorkerList().get(i).getUsername(),accHours.get(i)));
		}
		
		table.setItems(list);
	}

	private void updateLabels() {
		lblActivityName.setText("Activity: "+activity.getName());
		lblWorkerCounter.setText("Worker count: "+workers.size()+"");
		lblWorkedHours.setText("Worked hours: "+activity.getHours()+"");
	}
	



	
	
}
