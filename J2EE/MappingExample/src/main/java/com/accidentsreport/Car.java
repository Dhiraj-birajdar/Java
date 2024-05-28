package com.accidentsreport;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cId;
	String cName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lId")
	Location aLocation;

	public Car() {
		super();
	}

	public Car(String cName, Location aLocation) {
		super();
		this.cName = cName;
		this.aLocation = aLocation;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Location getaLocation() {
		return aLocation;
	}

	public void setaLocation(Location aLocation) {
		this.aLocation = aLocation;
	}

	@Override
	public String toString() {
		return "Car [cId=" + cId + ", cName=" + cName + ", aLocation=" + aLocation + "]";
	}	
	
}
