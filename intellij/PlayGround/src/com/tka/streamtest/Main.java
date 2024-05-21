package com.tka.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        List<Integer> i =
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> st = li.stream().max((x,y)-> x.compareTo(y));
        li = li.stream().map(x->x*x).collect(Collectors.toList());
            li.forEach(System.out::println);
//        System.out.println(li.stream().max(Integer::compareTo).get());
        System.out.println(Collections.max(li) instanceof Integer);
        Collections.reverse(li);
        System.out.println(li);

        System.out.println(IntStream.range(1,11).sum());

        Arrays.stream(new int[]{5,2,4,8,6,3})
                .average()
                .ifPresent(System.out::println);

    }
}
