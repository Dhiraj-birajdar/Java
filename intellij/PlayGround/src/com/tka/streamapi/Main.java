package com.tka.streamapi;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        streamPrime(5);
    }

    static void streamPrime(int num){
//        int [] arr = IntStream.range(1,10).toArray();

        List<Integer> pl = IntStream.range(1,num).filter(n->{
            for(int i=2;i<=n/2;n++)
                if(n%i==0)
                    return false;
            return true;
        }).boxed().toList();


        List<Integer> li = IntStream.range(1,num).boxed().toList(); // int to Integer
        System.out.println(li);
        li = li.stream().filter(n->{
            for(int i=2;i<=n/2;n++)
                if(n%i==0)
                    return false;
            return true;
        }).toList();
        System.out.println(li);

        java.util.Random r =new Random();
        System.out.println(r.nextInt(50,100));




    }
}
