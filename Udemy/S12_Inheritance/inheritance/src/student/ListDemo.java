package student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo extends Thread {

    public static void main(String[] args) {
        // List Intereface
        System.out.println("List Intereface:");

        // ArrayList demo
        List arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList Elements: " + arrayList);
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Additional methods for ArrayList
        arrayList.add(1, "Orange");  // Add element at index 1
        System.out.println("After adding Orange at index 1: " + arrayList);
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        System.out.println("Index of 'Cherry': " + arrayList.indexOf("Cherry"));

        // Using additional methods
        List<String> additionalElements = new ArrayList<>();
        additionalElements.add("Grapes");
        additionalElements.add("Pineapple");
        arrayList.addAll(additionalElements);  // AddAll
        System.out.println("After adding additional elements: " + arrayList);
        arrayList.remove("Banana");  // Remove
        System.out.println("After removing 'Banana': " + arrayList);
        arrayList.removeAll(additionalElements);  // RemoveAll
        System.out.println("After removing all additional elements: " + arrayList);
        arrayList.clear();  // Clear
        System.out.println("After clearing the ArrayList: " + arrayList);
        System.out.println();

        // LinkedList demo
        LinkedList linkedList = new LinkedList();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");

        System.out.println("LinkedList Elements: " + linkedList);
        System.out.println("Size of LinkedList: " + linkedList.size());
        System.out.println("First element: " + ((LinkedList) linkedList).getFirst());
        System.out.println("Last element: " + ((LinkedList) linkedList).getLast());

        // Additional methods for LinkedList
        ((LinkedList) linkedList).addFirst("Mouse");
        ((LinkedList) linkedList).addLast("Giraffe");
        System.out.println("After adding Mouse at the beginning and Giraffe at the end: " + linkedList.peek());
        System.out.println("Peek: " + ((LinkedList) linkedList).peek());
        System.out.println("Pop: " + ((LinkedList) linkedList).pop());

        // Using additional methods
        linkedList.addAll(additionalElements);  // AddAll
        System.out.println("After adding additional elements: " + linkedList);
        linkedList.remove("Cat");  // Remove
        System.out.println("After removing 'Cat': " + linkedList);
        linkedList.removeAll(additionalElements);  // RemoveAll
        System.out.println("After removing all additional elements: " + linkedList);
        linkedList.clear();  // Clear
        System.out.println("After clearing the LinkedList: " + linkedList);
        System.out.println();

        // Vector demo
        List vector = new Vector();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        System.out.println("Vector Elements: " + vector);
        System.out.println("Size of Vector: " + vector.size());
        System.out.println("Element at index 2: " + vector.get(2));


        vector.add(0,"Zero");
        System.out.println("After inserting 'Zero' at index 0: " + vector);

        vector.addAll(additionalElements);
        System.out.println("After adding additional elements: " + vector);
        vector.remove("Two");
        System.out.println("After removing 'Two': " + vector);
        vector.removeAll(additionalElements);
        System.out.println("After removing all additional elements: " + vector);
        vector.clear();
        System.out.println("After clearing the Vector: " + vector);
    }
}

