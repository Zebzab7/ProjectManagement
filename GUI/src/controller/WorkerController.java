package controller;

import java.awt.Button;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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
	
	private ManagementApp managementApp;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
		lblWorkerID.setText("Welcome back: "+managementApp.getUser().currentUser().getUsername());
		
		ArrayList<Worker> users = managementApp.getUsers();
		
		for(Worker w : users) {
			listView2.getItems().add(w.getUsername());
		}
		
		ArrayList<Project> projects = managementApp.getProjects();
		
		for(Project p : projects) {
			listView1.getItems().add(p.getName());
		}
	}
	
	public void addProject(ActionEvent e) throws Exception {
		if(managementApp.createProject(textField1.getText())) {
			Project p = managementApp.findProject(textField1.getText());
			listView1.getItems().add(p.getName());
		}
		
	}
	
	public void removeProject(ActionEvent e) throws Exception {
		Project p = managementApp.findProject(textField1.getText());
		
		if(p != null) {
			managementApp.removeProject(p);
			listView1.getItems().remove(p.getName());
		}
		
	}
}
