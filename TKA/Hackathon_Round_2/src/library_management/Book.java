package library_management;

import java.util.ArrayList;

 //Concrete class representing a Book
public class Book implements LibraryItem {
	 private ArrayList<String> books = new ArrayList<>();

	 @Override
	 public void addItem(String book) {
	     books.add(book);
	     System.out.println("Book '" + book + "' added to library.");
	 }

	 @Override
	 public boolean searchItem(String book) {
	     for (String b : books) {
	         if (b.equalsIgnoreCase(book)) {
	             System.out.println("Book '" + book + "' found in library.");
	             return true;
	         }
	     }
	     System.out.println("Book '" + book + "' not found in library.");
	     return false;
	 }

	 @Override
	 public void removeItem(String book) {
	     if (books.remove(book)) {
	         System.out.println("Book '" + book + "' removed from library.");
	     } else {
	         System.out.println("Book '" + book + "' not found in library. Unable to remove.");
	     }
	 }
	}

