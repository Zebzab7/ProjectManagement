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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import softwareHuset.ManagementApp;
import softwareHuset.State;

public class LoginRegisterController implements Initializable {
	@FXML
	private Label lblStatus;
	@FXML
	private Label lblStatus1;
	@FXML
	private TextField txtUsername;
	@FXML
	private TextField txtPassword;
	@FXML
	private RadioButton rb1;
	@FXML
	private RadioButton rb2;
	@FXML
	private Label lblErrorMessage;
	
	private String username;
	private String password;
	private State state;
	private ManagementApp managementApp;
	private boolean loginRegister = true;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		managementApp = Main.getManagementApp();
	}
	
	public void Login(ActionEvent event) throws Exception {
		this.username = txtUsername.getText();
		this.password = txtPassword.getText();
		
		managementApp.Logout();
		if(!managementApp.LoggedIn()) {
			if(loginRegister) {
				if(managementApp.Login(username, password)) {
					
					lblStatus1.setText("Login succees");
					((Node)event.getSource()).getScene().getWindow().hide();
					
					try {
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
				} else {
					lblStatus1.setText("Login failed");
				}
			} else {
				if(managementApp.CreateUser(txtUsername.getText(), txtPassword.getText())) {
					reset();
					lblStatus1.setText("User registeret successfully");
					
				} else {
					lblStatus1.setText("There was an error. Try again!");
				}
				
			}
		}
	}
	
	public void radioSelect(ActionEvent e) {
		if(rb1.isSelected()) {
			lblStatus.setText("Login");
			reset();
			loginRegister = true;
		}
		if(rb2.isSelected()) {
			lblStatus.setText("Register");
			reset();
			loginRegister = false;
		}
	}
	
	public void reset() {
		lblStatus1.setText("");
		txtUsername.setText("");
		txtPassword.setText("");
	}
}
