package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        // Set interface 
        System.out.println("Set Interface :");

        // HashSet 
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println("HashSet Elements: " + hashSet);
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        Set<String> additionalElements = new HashSet<>();
        additionalElements.add("Grapes");
        additionalElements.add("Pineapple");
        hashSet.addAll(additionalElements);
        System.out.println("After adding additional elements: " + hashSet);
        hashSet.removeAll(additionalElements);
        System.out.println("After removing all additional elements: " + hashSet);
        hashSet.clear();
        System.out.println("After clearing the HashSet: " + hashSet);
        System.out.println();

        // TreeSet 
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Elephant");

        System.out.println("TreeSet Elements: " + treeSet);
        System.out.println("Size of TreeSet: " + treeSet.size());

        treeSet.addAll(additionalElements);
        System.out.println("After adding additional elements: " + treeSet);
        System.out.println();

        // LinkedHashSet 
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        System.out.println("LinkedHashSet Elements: " + linkedHashSet);
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Contains 'Two': " + linkedHashSet.contains("Two"));

        linkedHashSet.addAll(additionalElements);
        System.out.println("After adding additional elements: " + linkedHashSet);
        linkedHashSet.removeAll(additionalElements);
        System.out.println("After removing all additional elements: " + linkedHashSet);
        linkedHashSet.clear();
        System.out.println("After clearing the LinkedHashSet: " + linkedHashSet);
    }
}
