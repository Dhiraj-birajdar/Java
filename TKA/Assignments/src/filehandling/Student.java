package filehandling;

import java.io.Serializable;

public class Student implements Serializable {
	
	static int rno = 111;
	String name;
	int rollNum;
	double marks;
	transient String add;
	transient String phno;
	
	public Student(String name, double marks, String add, String phno) {
		super();
		this.name = name;
		this.rollNum = rno++;
		this.marks = marks;
		this.add = add;
		this.phno = phno;
	}
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
	
}
