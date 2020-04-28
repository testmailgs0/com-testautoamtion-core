package org.company.databaselayer.Models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Temp {

	@Id
	private int ID;
	private String Name;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
