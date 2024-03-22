package library_management;

import java.util.ArrayList;

//Concrete class representing a DVD
public class DVD implements LibraryItem {
private ArrayList<String> dvds = new ArrayList<>();

@Override
public void addItem(String dvd) {
   dvds.add(dvd);
   System.out.println("DVD '" + dvd + "' added to library.");
}

@Override
public boolean searchItem(String dvd) {
   for (String d : dvds) {
       if (d.equalsIgnoreCase(dvd)) {
           System.out.println("DVD '" + dvd + "' found in library.");
           return true;
       }
   }
   System.out.println("DVD '" + dvd + "' not found in library.");
   return false;
}

@Override
public void removeItem(String dvd) {
   if (dvds.remove(dvd)) {
       System.out.println("DVD '" + dvd + "' removed from library.");
   } else {
       System.out.println("DVD '" + dvd + "' not found in library. Unable to remove.");
   }
}
}
