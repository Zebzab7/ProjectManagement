package application;
	
import controller.LoginRegisterController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import softwareHuset.ManagementApp;


public class Main extends Application {
	private static ManagementApp managementApp;
	
	public static ManagementApp getManagementApp() {
		return managementApp;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		managementApp = new ManagementApp();
		managementApp.CreateUser("user", "1234");
		
		primaryStage.setTitle("Login");
		try {
			FXMLLoader loader = new FXMLLoader();
			Parent root = loader.load(getClass().getResource("/view/LoginRegister.fxml").openStream());
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
