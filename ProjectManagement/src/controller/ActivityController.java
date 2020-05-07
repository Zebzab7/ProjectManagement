package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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
	
	private Activity activity;
	private ArrayList<Worker> workers;
	private ManagementApp managementApp;

	public void initialize(Activity a) {
		this.managementApp = Main.getManagementApp();
		activity = managementApp.getState().currentActivity();
		System.out.print(activity.getName());
//		updateLabels();
	}

	private void updateLabels() {
		lblActivityName.setText("Activity: "+activity.getName());
		lblWorkerCounter.setText("Worker count: "+workers.size()+"");
		lblWorkedHours.setText("Worked hours: "+activity.workedHours()+"");
	}



	
	
}
