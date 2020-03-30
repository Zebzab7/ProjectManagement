package project.management;

public class User {
	private boolean isAdmin;
	private int ID;
	private String name;
	
	public User(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public void setManager(boolean val) {
		if ( val ) isAdmin = true;
		else isAdmin = false;
	}
}
