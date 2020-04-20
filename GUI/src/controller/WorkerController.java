package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class WorkerController implements Initializable {
	@FXML
	private ListView<String> listView;
	
//	replace with actual tasks of the user
	String[] list = new String[] {"kravspecifkation", "projektledelse","analyse","design","programmering"};
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for(String e : list) {
			listView.getItems().add(e);
		}
	}
	
	public void startWork(ActionEvent event) {
		String taskName = listView.getSelectionModel().getSelectedItem();
		
		if(taskName != null) {
			((Node)event.getSource()).getScene().getWindow().hide();
			try {
				Stage primaryStage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				primaryStage.setTitle("Worker Task");
				Pane root = loader.load(getClass().getResource("../view/WorkerTask.fxml").openStream());
				WorkerTaskController workerTaskController = (WorkerTaskController) loader.getController();
				workerTaskController.getTaskName(taskName);
				Scene scene = new Scene(root,500,500);
				scene.getStylesheets().add(getClass().getResource("../application/application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
