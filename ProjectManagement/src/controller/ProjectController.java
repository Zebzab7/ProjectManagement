package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import project_management.Activity;
import project_management.ManagementApp;
import project_management.OperationNotAllowedException;
import project_management.Project;
import project_management.Worker;
import runner_class.Main;

public class ProjectController implements Initializable {
	@FXML
	private Label lblProjectName;
	@FXML
	private Label lblWorkerCounter;
	@FXML
	private Label lblProjectLeader;
	@FXML
	private Label lblWorkedHours;
	@FXML
	private ListView<String> listView1;
	@FXML
	private ListView<String> listView2;
	@FXML
	private Button createActivity;
	@FXML
	private TextField activityName;
	@FXML
	private TextField activityET;
	@FXML
	private Label lblStatus;
	
	private ManagementApp managementApp;
	private Project project;
	private Worker projectLeader;
	private int workerCounter;
	private Activity selectedActivity;
	
//	Initialize
	public void init() {
		updateLabels();
		updateWorkerList();
		
		try {
			updateTaskList();
		} catch (OperationNotAllowedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
		project = managementApp.getState().currentProject();
		projectLeader = project.getProjectLeader();
		workerCounter = project.getWorkerList().size();
		
		init();
		
		listView1.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
			selectedActivity = project.findActivity(newVal);
		});
	}
	
//	ActionEvents
	public void ViewActivity(ActionEvent event) {
		if(selectedActivity != null) {
			try {
				if(selectedActivity.findWorker(managementApp.getState().currentUser().getUsername()) == null) {
					selectedActivity.addWorker(managementApp.getState().currentUser());
				}
				managementApp.getState().setActivity(selectedActivity);
				
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Activity");
				FXMLLoader loader = new FXMLLoader();
				Parent root = loader.load(getClass().getResource("../view/Activity.fxml").openStream());
				ActivityController activityController = (ActivityController) loader.getController();
				activityController.initialize(selectedActivity);
				Scene scene = new Scene(root,500,500);
				scene.getStylesheets().add(getClass().getResource("../runner_class/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			lblStatus.setText("Please select activity");
		}
	}
	
	public void CreateActivity(ActionEvent event) throws OperationNotAllowedException {
		if(projectLeader.getUsername() == managementApp.getState().currentUser().getUsername()) {
			String name = activityName.getText();
			String estimate = activityET.getText();
			int ET = Integer.parseInt(estimate);
			project.addActivity(new Activity(name, managementApp.getState()));
			updateTaskList();
		}
	}
	
	public void GoBack(ActionEvent event) {
		try {		
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Worker");
			FXMLLoader loader = new FXMLLoader();
			Parent root = loader.load(getClass().getResource("../view/Worker.fxml").openStream());
			Scene scene = new Scene(root,759,460);
			scene.getStylesheets().add(getClass().getResource("../runner_class/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
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
	
//	Methods
	public void updateLabels() {
		lblProjectName.setText("Project: "+project.getName());
		if(projectLeader != null) {
			lblProjectLeader.setText("Project Leader: "+projectLeader.getUsername());
			
			if(projectLeader.getUsername() == managementApp.getState().currentUser().getUsername()) {
				createActivity.setDisable(false);
				activityName.setDisable(false);
				activityET.setDisable(false);
			} else {
				createActivity.setDisable(true);
				activityName.setDisable(true);
				activityET.setDisable(true);
			}
		} else {
			lblProjectLeader.setText("Project Leader: not defined");
			createActivity.setDisable(true);
			activityName.setDisable(true);
			activityET.setDisable(true);
		}
		
		lblWorkerCounter.setText("Workers on this project: "+workerCounter+"");
		lblWorkedHours.setText("Worked hours: "+project.workedHours());
	}
	
	public void updateTaskList() throws OperationNotAllowedException {
		listView1.getItems().clear();
		for(Activity task : project.getActivityList()) {
			listView1.getItems().add(task.getName());
		}
	}
	
	public void updateWorkerList() {
		for(Worker w : project.getWorkerList()) {
			listView2.getItems().add(w.getUsername());
		}
	}
	
}