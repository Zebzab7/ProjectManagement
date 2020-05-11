package controller;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ActivityUserTable {
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty name;
	private final SimpleDoubleProperty hours;
	
	public ActivityUserTable(Integer id, String name, double d) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.hours = new SimpleDoubleProperty(d);
	}

	public Integer getId() {
		return id.get();
	}

	public String getName() {
		return name.get();
	}

	public double getHours() {
		return hours.get();
	}
}
