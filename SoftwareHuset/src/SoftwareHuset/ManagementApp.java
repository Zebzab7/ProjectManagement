package softwareHuset;

import java.util.ArrayList;

import java.util.stream.Collectors;

public class ManagementApp {
	ArrayList<Project> project = new ArrayList<Project>();
	ArrayList<Worker> users = new ArrayList<Worker>();
	
	private boolean loggedIn = false;
	private String password = "1234";
	
	public boolean LoggedIn() {
		return loggedIn;
	}
	public boolean Login(String password) {
		if (this.password.equals(password)) {
			loggedIn = true;
			return true;
		}
		return false;
	}
}
