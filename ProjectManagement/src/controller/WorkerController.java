//package controller;
//
//import java.awt.Button;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.ResourceBundle;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.ListView;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//import project_management.ManagementApp;
//import project_management.Project;
//import project_management.Worker;
//import runner_class.Main;
//
//public class WorkerController implements Initializable {
//	@FXML
//	private Label lblWorkerID;
//	@FXML
//	private ListView<String> listView1;
//	@FXML
//	private ListView<String> listView2;
//	@FXML
//	private Button btnChangeProject;
//	@FXML
//	private TextField textField1;
//	@FXML
//	private Label lblUser;
//	@FXML
//	private Label lblProject;
//	@FXML
//	private Label lblStatus;
//	
//	private ManagementApp managementApp;
//	private Project selectedProject;
//	private Worker selectedWorker;
//	private String lastProjectName;
//	
////	Initialize
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		managementApp = Main.getManagementApp();
//		lblWorkerID.setText("Welcome back: "+managementApp.getState().currentUser().getUsername());
//		updateProjectList();
//		updateUserList();
//		
//		listView1.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
//			try {
//				selectedProject = managementApp.findProject(newVal);
//				if(selectedProject != null) {
//					lastProjectName = selectedProject.getName();
//				} else {
//					lastProjectName = "";
//				}
//				
//				if(!lastProjectName.equals("")) {
//					lblProject.setText("Project: "+lastProjectName);
//				} else {
//					lblProject.setText("");
//				}
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//		});
//		
//		listView2.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
//			try {
//				selectedWorker = managementApp.findWorker(newVal);
//				lblUser.setText("User: "+selectedWorker.getUsername());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
//	}
//	
////	ActionEvents
//	public void ViewProject(ActionEvent event) throws Exception {
//		if(selectedProject != null) {
//			((Node) event.getSource()).getScene().getWindow().hide();
//			
//			try {
//				Stage primaryStage = new Stage();
//				primaryStage.setTitle("Worker");
//				FXMLLoader loader = new FXMLLoader();
//				Parent root = loader.load(getClass().getResource("../view/Project.fxml").openStream());
//				ProjectController projectController = (ProjectController) loader.getController();
//				projectController.setProject(selectedProject);
//				Scene scene = new Scene(root,530,500);
//				scene.getStylesheets().add(getClass().getResource("../runner_class/application.css").toExternalForm());
//				primaryStage.setScene(scene);
//				primaryStage.show();
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
//	
//	public void addProject(ActionEvent e) throws Exception {
//		String name = textField1.getText();
//		
//		if(managementApp.LoggedIn()) {
//			if(managementApp.addProject(new Project(name,managementApp.getState()))) {
//				Project p = managementApp.findProject(textField1.getText());
//				listView1.getItems().add(p.getName());
//				textField1.setText("");
//			}
//		}
//	}
//	
//	public void SetAsProjectLeader(ActionEvent e) throws Exception {
//		if(selectedProject != null && selectedWorker != null) {
//			selectedProject.setProjectLeader(selectedWorker);
//			addUserToProject(selectedProject, selectedWorker);
//			
//			lblStatus.setText("Worker: "+selectedWorker.getUsername()+" is now project leader in project: "+selectedProject.getName());
//			
//		}
//	}
//	
//	public void AddUserToProject(ActionEvent e) throws Exception {
//		if(selectedProject != null && selectedWorker != null) {
//			if(addUserToProject(selectedProject,selectedWorker)) {
//				lblStatus.setText("Worker: "+selectedWorker.getUsername()+" have been added to project: "+selectedProject.getName());
//			}
//		}
//		
//	}
//		
//	public void removeProject(ActionEvent e) throws Exception {
//		if(selectedProject != null ) {
//			lblStatus.setText("Project: "+lastProjectName+" was succesfully removed");
//			managementApp.removeProject(selectedProject);
//			updateProjectList();
//		}
//	}
//	
//	public void LogOut(ActionEvent event) {
//		try {
//			if(managementApp.Logout()) {
//				((Node) event.getSource()).getScene().getWindow().hide();
//				Stage primaryStage = new Stage();
//				primaryStage.setTitle("Worker");
//				FXMLLoader loader = new FXMLLoader();
//				Parent root = loader.load(getClass().getResource("../view/LoginRegister.fxml").openStream());
//				Scene scene = new Scene(root,400,400);
//				scene.getStylesheets().add(getClass().getResource("../runner_class/application.css").toExternalForm());
//				primaryStage.setScene(scene);
//				primaryStage.show();
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
////	Methods
//	public boolean addUserToProject(Project p, Worker w) throws Exception {
//		for(Worker worker : p.getWorkerList()) {
//			if(worker.getUsername() == w.getUsername()) {
//				return false;
//			}
//		}
//		managementApp.addWorkerToProject(w, p);
//		
//		return true;
//	}
//	
//	public void updateProjectList() {
//		listView1.getItems().clear();
//		ArrayList<Project> projects = managementApp.getProjects();
//		for(Project p : projects) {
//			listView1.getItems().add(p.getName());
//		}
//	}
//	
//	public void updateUserList() {
//		listView2.getItems().clear();
//		ArrayList<Worker> users = managementApp.getUsers();
//		for(Worker w : users) {
//			listView2.getItems().add(w.getUsername());
//		}
//	}
//}
