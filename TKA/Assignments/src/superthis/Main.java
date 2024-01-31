package superthis;
/**
 * @author Dhiraj Birajdar
 * @version 31.01.2024 
 */
//Parent class
class Animal {
	String name;

	// Constructor of the Animal class
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal constructor called");
	}

	void eat() {
		System.out.println(name + " is eating");
	}
}

//Child class inheriting from Animal
class Dog extends Animal {
	String breed;

	// Constructor of the Dog class
	public Dog(String name, String breed) {
		// Call to the constructor of the parent class using 'super' keyword
		super(name);
		this.breed = breed;
		System.out.println("Dog constructor called");
	}

	// Another constructor in the Dog class using 'this' keyword
	public Dog(String name, String breed, int age) {
		// Call to the parameterized constructor of the same class using 'this' keyword
		this(name, breed);
		System.out.println("Dog parameterized constructor called with age: " + age);
	}

	// Method in Dog class
	void bark() {
		System.out.println(name + " is barking");
	}

}

public class Main {
	public static void main(String[] args) {
		// Create an instance of the Dog class using different constructors
		Dog myDog1 = new Dog("Tommy", "Pub");
		Dog myDog2 = new Dog("Max", "Pitbull", 3);

		// Call methods of the Dog class
		myDog1.bark();
		myDog1.eat();

		myDog2.bark();
		myDog2.eat();
	}
}
