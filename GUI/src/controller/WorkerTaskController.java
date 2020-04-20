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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WorkerTaskController implements Initializable {
	@FXML
	private TextField logTime;
	@FXML
	private Label lblError;
	@FXML
	private Label lblTaskName;
	@FXML
	private Label lblStartWeek;
	@FXML
	private Label lblEndWeek;
	@FXML
	private Label lblET;
	
	private int timeUsed;
	private String name;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		Get the information from the task
		lblStartWeek.setText("06");
		lblEndWeek.setText("09");
		lblET.setText("40");
	}
	
	public void getTaskName(String taskName) {
		lblTaskName.setText(taskName);
	}
	
	public void logTime(ActionEvent event) {
		if(!checkInput(logTime.getText())) {
			lblError.setText("Please enter valid number");
		} else {
			((Node) event.getSource()).getScene().getWindow().hide();
			
			try {
				timeUsed = Integer.parseInt(logTime.getText());
				System.out.println("Time used: "+timeUsed);
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Worker");
				Parent root = FXMLLoader.load(getClass().getResource("../view/User.fxml"));
				Scene scene = new Scene(root,500,500);
				scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				
			}
		}
	}
	
	public boolean checkInput(String input) {
		
		if(input.isEmpty()) {
			return false;
		} else {
			char[] chars = input.toCharArray();
			for(char c : chars) {
				if(!Character.isDigit(c)) {
					return false;
				}
			}
		}
		
		return true;
	}

	
}
