package controller;

import java.awt.Button;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import softwareHuset.ManagementApp;
import softwareHuset.Project;
import softwareHuset.Worker;

public class WorkerController implements Initializable {
	@FXML
	private Label lblWorkerID;
	@FXML
	private ListView<String> listView1;
	@FXML
	private ListView<String> listView2;
	@FXML
	private Button btnChangeProject;
	@FXML
	private TextField textField1;
	@FXML
	private Label lblUser;
	@FXML
	private Label lblProject;
	@FXML
	private Label lblStatus;
	
	private ManagementApp managementApp;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
		lblWorkerID.setText("Welcome back: "+managementApp.getUser().currentUser().getUsername());
		updateProjectList();
		updateUserList();
		
		listView1.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
			lblProject.setText("Project: "+newVal);
			textField1.setText(newVal);
		});
		
		listView2.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
			lblUser.setText("User: "+newVal);
		});
	}
	
	public void ViewProject(ActionEvent event) throws Exception {
		String projectName = listView1.getSelectionModel().getSelectedItem();
		Project p = managementApp.findProject(projectName);
		
		if(p != null) {
			((Node) event.getSource()).getScene().getWindow().hide();
			
			try {
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Worker");
				FXMLLoader loader = new FXMLLoader();
				Parent root = loader.load(getClass().getResource("../view/Project.fxml").openStream());
				ProjectController projectController = (ProjectController) loader.getController();
				projectController.setProject(p);
				Scene scene = new Scene(root,530,500);
				scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void addProject(ActionEvent e) throws Exception {
		if(managementApp.createProject(textField1.getText())) {
			Project p = managementApp.findProject(textField1.getText());
			listView1.getItems().add(p.getName());
			reset();
		}
		
	}
	
	public void reset() {
		textField1.setText("");
	}
	
	public void AddUserToProject(ActionEvent e) throws Exception {
		String projectName = listView1.getSelectionModel().getSelectedItem();
		String workerName = listView2.getSelectionModel().getSelectedItem();
		Project p = managementApp.findProject(projectName);
		Worker w = managementApp.findWorker(workerName);
		
		if(p != null && w != null) {
			managementApp.addWorkerToProject(w, p);
			lblStatus.setText("Worker: "+w.getUsername()+" have been added to project: "+p.getName());
		}
	}
	
	public void removeProject(ActionEvent e) throws Exception {
		Project p = managementApp.findProject(textField1.getText());
		
		if(p != null) {
			managementApp.removeProject(p);
			listView1.getItems().remove(p.getName());
			lblStatus.setText("Project: "+p.getName()+" have been deleted");
		}
		
	}
	
	public void updateProjectList() {
		ArrayList<Project> projects = managementApp.getProjects();
		
		for(Project p : projects) {
			listView1.getItems().add(p.getName());
		}
	}
	
	public void updateUserList() {
		ArrayList<Worker> users = managementApp.getUsers();
		
		for(Worker w : users) {
			listView2.getItems().add(w.getUsername());
		}
	}
}
