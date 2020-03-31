package project.management.domain;


public class User {
	private boolean isLoggedIn;
	private String password, name;
	private int ID;
	
	public User(String name, int ID, String password) {
		this.name = name;
		this.ID = ID;
		this.password = password;
	}
	
	public void logOn(String password) {
		if ( this.password == password ) isLoggedIn = true;
		
	}
	
	public boolean isLoggedIn() {
		return true;
	}
}
