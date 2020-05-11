package runner_class;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project_management.ManagementApp;


public class Main extends Application {
	private static ManagementApp managementApp;
	
	public static ManagementApp getManagementApp() {
		return managementApp;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		managementApp = ManagementApp.getInstance();
		//tmpExampleUsers();
		primaryStage.setTitle("Login");
		try {
			FXMLLoader loader = new FXMLLoader();
			Parent root = loader.load(getClass().getResource("../view/LoginRegister.fxml").openStream());
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	public void tmpExampleUsers() throws Exception {
////		managementApp.createUser("Adams", "1234");
////		managementApp.createUser("Baker", "1234");
////		managementApp.createUser("Clark", "1234");
////		managementApp.createUser("Davis", "1234");
////		managementApp.createUser("Evans", "1234");
////		managementApp.createUser("Frank", "1234");
//	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
