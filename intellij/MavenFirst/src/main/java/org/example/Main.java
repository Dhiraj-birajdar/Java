package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[]{2,3,4,4,1,4,1};
        Set<Integer> s = new HashSet<>();
        for(int i: arr){
            s.add(i);
        }
        System.out.println(s);
    }

}