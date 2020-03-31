package project.management.app;

import project.management.domain.User;
import java.util.ArrayList;

public class ManagementApp {
	private static ArrayList<User> userList = new ArrayList<User>();
	
	public static void createUser(String name, int ID, String password) {
		User user = new User(name, ID, password);
		userList.add(user);
	}
	
	public static boolean isRegisteredUser(User user) {
		for (User registeredUser : userList) {
			if ( registeredUser == user ) return true;
		}
		return false;
	}
}
