package com.tka.streamapi;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> li = IntStream.range(1,19900000).boxed().toList();

        long time = System.currentTimeMillis();
        long newLi = li.stream()
                .filter(n->n%2==0)
//                .map(String::valueOf)
                .reduce(0, Integer::sum);
        System.out.println("Stream: "+(System.currentTimeMillis()-time));
        System.out.println(newLi);

        time = System.currentTimeMillis();
        long l = li.parallelStream()
                .filter(n->n%2==0)
//                .map(String::valueOf)
                .reduce(0, Integer::sum);
        System.out.println("ParallelStream: "+(System.currentTimeMillis()-time));
        System.out.println(l);

    }
}
