package controller;

import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;
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
import project_management.ItemTimeManager;
import project_management.ManagementApp;

import project_management.Project;
import project_management.State;
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
	
	
	private ManagementApp managementApp;
	private Project project;
	private Worker projectLeader;
	private int workerCounter;
	private Activity selectedActivity;
	
//	Initialize
	public void init() throws Exception {
		updateLabels();
		updateWorkerList();
		updateTimeLabels();
		
		try {
			updateTaskList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
		project = managementApp.getState().currentProject();
		projectLeader = project.getProjectLeader();
		workerCounter = project.getWorkerList().size();
		
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		listView1.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
			selectedActivity = project.findActivity(newVal);
		});
	}
	
	public void SetTime(ActionEvent event) throws Exception {
		int[] start = splitTimeInput(txtTime.getText()+"/");
		int[] end = splitTimeInput(txtTime1.getText()+"/");
		
		System.out.println(Arrays.toString(start));
		System.out.println(Arrays.toString(end));
		
		State.getInstance().currentProject().getTimeManager().setStartTime(start[2], start[1], start[0], State.getInstance().currentProject());
		State.getInstance().currentProject().getTimeManager().setEndTime(end[2], end[1], end[0], State.getInstance().currentProject());
		updateTimeLabels();
	}

	
	private void updateTimeLabels() throws Exception {
		ItemTimeManager t = State.getInstance().currentProject().getTimeManager();
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
	
//	ActionEvents
	public void ViewActivity(ActionEvent event) {
		if(selectedActivity != null) {
			try {
				if(selectedActivity.findWorker(managementApp.getState().currentUser().getUsername()) == null) {
					selectedActivity.addWorker(managementApp.getState().currentUser());
					managementApp.getState().currentUser().addActivity(selectedActivity);
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
	
	public void CreateActivity(ActionEvent event) throws Exception {
		if(projectLeader.getUsername() == managementApp.getState().currentUser().getUsername()) {
			String name = activityName.getText();
			project.addActivity(new Activity(name));
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
		lblWorkedHours.setText("Worked hours: "+project.getHours()/2.0);
	}
	
	public void updateTaskList() throws Exception {
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
