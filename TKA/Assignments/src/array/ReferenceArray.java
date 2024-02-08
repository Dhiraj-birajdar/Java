package array;

// Define a class for objects in the array
class Student {
	String name;
	int age;
	int rollNum;
	double cgpa;

	// Constructor
	public Student(String name, int age, int rollNum, double cgpa) {
		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
		this.cgpa = cgpa;
	}
}

public class ReferenceArray {
	public static void main(String[] args) {
		// Create an array of Student objects
		Student[] students = new Student[3];

		// Initialize individual objects in the array
		students[0] = new Student("Ajay", 20, 101, 3.8);
		students[1] = new Student("Sam", 22, 102, 3.5);
		students[2] = new Student("Sagar", 21, 103, 3.9);

		// Access and display information about each student
		System.out.println("Students in the array:");

		for (Student student : students) {
			System.out.println("Name: " + student.name + ", Age: " + student.age + ", Roll Number: " + student.rollNum
					+ ", CGPA: " + student.cgpa);
		}
	}
}
