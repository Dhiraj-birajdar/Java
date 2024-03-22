package library_management;

public class Main {
	 public static void main(String[] args) {
	     // Testing library management

	     // Create instances of Book and DVD
	     Book book = new Book();
	     DVD dvd = new DVD();

	     // Adding items
	     book.addItem("Java Programming");
	     book.addItem("Python Cookbook");
	     dvd.addItem("Inception");
	     dvd.addItem("The Matrix");

	     // Searching items
	     book.searchItem("Java Programming");
	     book.searchItem("C++ Programming");
	     dvd.searchItem("Inception");
	     dvd.searchItem("Interstellar");

	     // Removing items
	     book.removeItem("Python Cookbook");
	     book.removeItem("C Programming");
	     dvd.removeItem("The Matrix");
	     dvd.removeItem("Avatar");
	 }
	}
//Problem 2: Library Management
//• Define an interface Library Item with methods.
//o Add item - ArrayList Demonstration
//o Search item - Iterating ArrayList
//o Remove Item
//• Implement concrete classes like Book and DVD that implement the LibraryItem 
//interface.
//• call implemented methods to display output.
