package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int facultyCode;
	String facultyName;
	
	@OneToMany
	@JoinColumn(name = "facultyCode")
	List<Subject> subjects;
	
	public int getFacultyCode() {
		return facultyCode;
	}
	
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public void setFacultyCode(int facultyCode) {
		this.facultyCode = facultyCode;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	@Override
	public String toString() {
		return "Faculty [facultyCode=" + facultyCode + ", facultyName=" + facultyName + "]";
	}
	public Faculty(int facultyCode, String facultyName) {
		super();
		this.facultyCode = facultyCode;
		this.facultyName = facultyName;
	}
	public Faculty() {
		super();
	}
	public Faculty(String string) {
		this.facultyName =string;
	}
	
	
}
