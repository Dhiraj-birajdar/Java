package com.college;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subId;
	String subName;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Subject(int subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}
	public Subject() {
		super();
	}
	public Subject(String string) {
		this.subName = string;
	}
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + "]";
	}
	
	
}
