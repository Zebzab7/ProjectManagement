package controller;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ActivityUserTable {
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty name;
	private final SimpleIntegerProperty hours;
	
	public ActivityUserTable(Integer id, String name, Integer hours) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.hours = new SimpleIntegerProperty(hours);
	}

	public Integer getId() {
		return id.get();
	}

	public String getName() {
		return name.get();
	}

	public Integer getHours() {
		return hours.get();
	}
}
