package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private Label lblStatus;
	@FXML
	private TextField txtUsername;
	@FXML
	private TextField txtPassword;
	
	public void Login(ActionEvent event) {
		
		if(txtUsername.getText().equals("user") && txtPassword.getText().equals("1234")) {
			lblStatus.setText("Login succees");
			((Node)event.getSource()).getScene().getWindow().hide();
			
			try {
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Worker");
				Parent root = FXMLLoader.load(getClass().getResource("../view/User.fxml"));
				Scene scene = new Scene(root,500,500);
				scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else if(txtUsername.getText().equals("lead") && txtPassword.getText().equals("1234")) {
			lblStatus.setText("Login succees");
			((Node)event.getSource()).getScene().getWindow().hide();
			
			try {
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Project Leader");
				Parent root = FXMLLoader.load(getClass().getResource("../view/ProjectLeader.fxml"));
				Scene scene = new Scene(root,740,500);
				scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			lblStatus.setText("Login failed	");
		}
	}
}
