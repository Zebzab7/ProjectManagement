package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ProjectLeaderTaskController implements Initializable {
	@FXML
	private ListView listView;
	
	ObservableList<String> list = FXCollections.observableArrayList("0001", "0002","0003","0004","0005");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.setItems(list);
	}
	
	public void removeWorker(ActionEvent event) {
		
	}
}
