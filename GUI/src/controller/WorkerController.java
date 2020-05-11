package controller;

import java.awt.Button;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import project_management.ManagementApp;
import project_management.OperationNotAllowedException;
import project_management.Project;
import project_management.Worker;
import runner_class.Main;

public class WorkerController implements Initializable {
	@FXML
	private Label lblWorkerID;
	@FXML
	private ListView<String> listView1;
	@FXML
	private ListView<String> listView2;
	@FXML
	private ListView<String> listView3;
	@FXML
	private Button btnChangeProject;
	@FXML
	private TextField textField1;
	@FXML
	private Label lblProject;
	@FXML
	private Label lblStatus;
	@FXML
	private Labeled lblAssignedProject;
	
	private ManagementApp managementApp;
	private Project selectedProject;
	private Project selectedAssignedProject;
	
	
//	Initialize
	public void addExampleProjects() throws OperationNotAllowedException {
//		managementApp.addProject(new Project("Example project1"));
//		managementApp.addProject(new Project("Example project2"));
//		managementApp.addProject(new Project("Example project3"));
//		managementApp.addProject(new Project("Example project4"));
	}
	private void init() {
		lblWorkerID.setText("Welcome back: "+managementApp.getState().currentUser().getUsername());
		lblProject.setText("Select a project");
		lblAssignedProject.setText("Select assigned project");
		managementApp.getState().setProject(null);
		managementApp.getState().setActivity(null);
		
		try {
			addExampleProjects();
		} catch (OperationNotAllowedException e2) {
			e2.printStackTrace();
		}
		updateListView1();
		try {
			updateListView2();
		} catch(Exception e) {
			
		}
		try {
			ArrayList<Project> assignedProjects = managementApp.getState().currentUser().getAssignedProjects();
			for(Project p : assignedProjects) {
				listView2.getItems().add(p.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		updateListView3();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
		selectedProject = null;
		selectedAssignedProject = null;
		init();
		
		listView1.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
			try {
				selectedProject = managementApp.findProject(newVal);
				if(selectedProject != null) {
					lblProject.setText(selectedProject.getName());
				} else {
					lblProject.setText("Select a project");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		});
		
		listView2.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
			try {
				selectedAssignedProject = managementApp.findProject(newVal);
				if(selectedAssignedProject != null) {
					lblAssignedProject.setText(selectedAssignedProject.getName());
				} else {
					lblAssignedProject.setText("Select assigned project");
				}
				
//				updateListView2();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		});
	}
	
//	ActionEvents
	public void ViewProject(ActionEvent event) throws Exception {
		if(selectedAssignedProject != null) {
			managementApp.getState().setProject(selectedAssignedProject);
			((Node) event.getSource()).getScene().getWindow().hide();
			
			try {
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Worker");
				FXMLLoader loader = new FXMLLoader();
				Parent root = loader.load(getClass().getResource("../view/Project.fxml").openStream());
				Scene scene = new Scene(root,530,545);
				scene.getStylesheets().add(getClass().getResource("../runner_class/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void addProject(ActionEvent e) throws Exception {
		String name = textField1.getText();
		
		if(managementApp.LoggedIn()) {
			try {
				if(managementApp.addProject(new Project(name))) {
					Project p = managementApp.findProject(textField1.getText());
					listView1.getItems().add(p.getName());
					lblStatus.setText("Project "+textField1.getText()+" added to list");
					textField1.setText("");
				}
			} catch(Exception e1) {
				lblStatus.setText("Project already exists");
			}
		}
	}
	
	public void SetAsProjectLeader(ActionEvent e) throws Exception {
		if(selectedAssignedProject != null) {
			if(!selectedAssignedProject.hasProjectLeader()) {
				selectedAssignedProject.setProjectLeader(managementApp.getState().currentUser());
				lblStatus.setText("You are now leader in "+selectedAssignedProject.getName());
			} else {
				lblStatus.setText("This project already has a leader");
			}
		}
	}
	
	public void AddUserToProject(ActionEvent e) throws Exception {
		if(selectedProject != null) {
			if(!selectedProject.containsWorker(managementApp.getState().currentUser())) {
				managementApp.addWorkerToProject(managementApp.getState().currentUser(), selectedProject);
				System.out.println(selectedProject.getWorkerList());
				updateListView2();
				listView2.getItems().add(selectedProject.getName());
				lblStatus.setText("You are now working on project "+selectedProject.getName());
			}
			
		}
		
	}
		
	public void removeProject(ActionEvent e) throws Exception {
		if(selectedProject != null ) {
			managementApp.removeProject(selectedProject);
			selectedProject = null;
			lblStatus.setText("Project was succesfully removed");
			updateListView1();
			updateListView2();
		}
	}
	
	public void LogOut(ActionEvent event) {
		try {
			if(managementApp.Logout()) {
				((Node) event.getSource()).getScene().getWindow().hide();
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
	private void updateListView1() {
		listView1.getItems().clear();
		ArrayList<Project> projects = managementApp.getProjects();
		for(Project p : projects) {
			listView1.getItems().add(p.getName());
		}
	}
	
	private void updateListView2() {
		listView2.getItems().clear();
	}
	
	private void updateListView3() {
		listView3.getItems().clear();
		
		ArrayList<Worker> users = managementApp.getUsers();
		
		for(Worker w : users) {
			listView3.getItems().add(w.getUsername());
		}
	}
}
