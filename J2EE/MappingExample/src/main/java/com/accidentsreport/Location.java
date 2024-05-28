package com.accidentsreport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int lId;
	String lName;
	public Location(String lName) {
		super();
		this.lName = lName;
	}
	public Location() {
		super();
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Location [lId=" + lId + ", lName=" + lName + "]";
	}
	
	
}
