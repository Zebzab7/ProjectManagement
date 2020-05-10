package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
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
import softwareHuset.ManagementApp;
import softwareHuset.OperationNotAllowedException;
import softwareHuset.Project;
import softwareHuset.Task;
import softwareHuset.Worker;

public class ProjectController implements Initializable {
	@FXML
	private Label lblProjectName;
	@FXML
	private Label lblWorkerCounter;
	@FXML
	private Label lblProjectLeader;
	@FXML
	private ListView<String> listView1;
	@FXML
	private ListView<String> listView2;
	@FXML
	private Button createTask;
	@FXML
	private TextField taskName;
	@FXML
	private TextField taskET;
	
	private ManagementApp managementApp;
	private Project project;
	private Worker projectLeader;
	private int workerCounter;
	
//	Initialize
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
	}
	
	public void setProject(Project p) throws OperationNotAllowedException {
		this.project = p;
		this.projectLeader = p.getProjectLeader();
		this.workerCounter = p.getWorkerList().size();
		
		updateLabels();
		updateWorkerList();
		updateTaskList();
	}
	
//	ActionEvents
	public void CreateTask(ActionEvent event) throws OperationNotAllowedException {
		if(projectLeader.getUsername() == managementApp.getUser().currentUser().getUsername()) {
			String name = taskName.getText();
			String ET = taskET.getText();
			project.createTask(name, ET);
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
			Scene scene = new Scene(root,530,500);
			scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
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
				scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
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
			
			if(projectLeader.getUsername() == managementApp.getUser().currentUser().getUsername()) {
				createTask.setDisable(false);
				taskName.setDisable(false);
				taskET.setDisable(false);
			} else {
				createTask.setDisable(true);
				taskName.setDisable(true);
				taskET.setDisable(true);
			}
		} else {
			lblProjectLeader.setText("Project Leader: not defined");
			createTask.setDisable(true);
			taskName.setDisable(true);
			taskET.setDisable(true);
		}
		
		lblWorkerCounter.setText("Workers on this project: "+workerCounter+"");
	}
	
	public void updateTaskList() throws OperationNotAllowedException {
		listView1.getItems().clear();
		for(Task task : project.getTaskList()) {
			listView1.getItems().add(task.getName());
		}
		
		
	}
	
	public void updateWorkerList() {
		for(Worker w : project.getWorkerList()) {
			listView2.getItems().add(w.getUsername());
		}
	}
	
}
