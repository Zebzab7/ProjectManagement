package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ProjectLeaderController implements Initializable {
	@FXML
	private Label projectLeaderID;
	@FXML
	private Label projectID;
	@FXML
	private ListView listView1;
	@FXML
	private ListView listView2;
	ObservableList<String> tasks = FXCollections.observableArrayList("kravspecifkation", "projektledelse","analyse","design","programmering");
	ObservableList<String> workers = FXCollections.observableArrayList("XXXX", "XXXX","XXXX","XXXX","XXXX");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView1.setItems(tasks);
		listView2.setItems(workers);
	}
	
	public void viewTask(ActionEvent event) {
		
		String taskName = (String) listView1.getSelectionModel().getSelectedItem();
		if(taskName != null) {
			((Node)event.getSource()).getScene().getWindow().hide();
			try {
				Stage primaryStage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				primaryStage.setTitle("ProjectLeader Task");
				Pane root = loader.load(getClass().getResource("../view/ProjectLeaderTask.fxml").openStream());
				Scene scene = new Scene(root,500,500);
				scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void viewWorkerProfile(ActionEvent event) {
		
	}
}
