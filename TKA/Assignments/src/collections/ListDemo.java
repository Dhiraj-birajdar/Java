package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

    public static void main(String[] args) {
        // List Interface
        System.out.println("List Interface :");

        // ArrayList
        List arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList Elements: " + arrayList);
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));


        List<String> additionalElements = new ArrayList<>();
        additionalElements.add("Grapes");
        additionalElements.add("Pineapple");
        arrayList.addAll(additionalElements); 
        System.out.println("After adding additional elements: " + arrayList);
        arrayList.removeAll(additionalElements); 
        System.out.println("After removing all additional elements: " + arrayList);
        System.out.println("Contains Apple? :"+arrayList.contains("Apple"));
        arrayList.clear(); 
        System.out.println("After clearing the ArrayList: " + arrayList);
        System.out.println();

        // LinkedList 
        List linkedList = new LinkedList();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");

        System.out.println("LinkedList Elements: " + linkedList);
        System.out.println("Size of LinkedList: " + linkedList.size());
        System.out.println("First element: " + linkedList.get(0));


        linkedList.addAll(additionalElements);
        System.out.println("After adding additional elements: " + linkedList);
        linkedList.remove("Cat");  
        System.out.println("After removing 'Cat': " + linkedList);
        System.out.println("Contains Dog? :"+linkedList.contains("Dog"));
        linkedList.clear(); 
        System.out.println("After clearing the LinkedList: " + linkedList);
        System.out.println();

        // Vector 
        List vector = new Vector();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        System.out.println("Vector Elements: " + vector);
        System.out.println("Size of Vector: " + vector.size());
        System.out.println("Element at index 2: " + vector.get(2));


        vector.addAll(additionalElements); 
        System.out.println("After adding additional elements: " + vector);
        vector.removeAll(additionalElements); 
        System.out.println("After removing all additional elements: " + vector);
        System.out.println("Contains One? :"+vector.contains("One"));
        vector.clear(); 
        System.out.println("After clearing the Vector: " + vector);
    }
}
