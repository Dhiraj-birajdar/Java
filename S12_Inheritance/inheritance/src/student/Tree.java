package student;
import javafx.collections.transformation.SortedList;

import java.util.*;
public class Tree {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(45);
        ss.add(4);
        ss.add(458);
        ss.add(2);
        System.out.println(ss);

        List <String> sl = new ArrayList<>();
        sl.add("a");
        sl.add("b");
        sl.add("kds");
        sl.add("zz");
        sl.add("aa");
        Collections.sort(sl);
        System.out.println(sl);

    }
    static void m1(int a){
        System.out.println(a);
    }
}
