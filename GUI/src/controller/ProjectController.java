package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import softwareHuset.ManagementApp;
import softwareHuset.Project;
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
	
	private ManagementApp managementApp;
	private Project project;
	private Worker projectLeader;
	private int workerCounter;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
	}
	
	public void updateLabels() {
		lblProjectName.setText("Project: "+project.getName());
		if(projectLeader != null) {
			lblProjectLeader.setText("Project Leader: "+projectLeader.getUsername());
		} else {
			lblProjectLeader.setText("Project Leader: null");
		}
		
		lblWorkerCounter.setText("Workers on this project: "+workerCounter+"");
	}
	
	public void updateWorkerList() {
		for(Worker w : project.getWorkerList()) {
			listView2.getItems().add(w.getUsername());
		}
	}
	
	public void setProject(Project p) {
		this.project = p;
		this.projectLeader = p.getProjectLeader();
		this.workerCounter = p.getWorkerList().size();
		
		updateLabels();
		updateWorkerList();
	}
}
