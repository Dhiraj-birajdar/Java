package com.tka.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

//        streamPrime(5);
//        String s = "ilovei";
//        var ans = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(a->a.getValue()==1)
//                .findFirst()
//                .orElseThrow();
//        System.out.println(ans.getKey());
        int[] arr = {1,2,3,4,5,6};
        var second = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(second);

        String[] strs = {"a","ag","adf","adfg"};
        System.out.println(Arrays.stream(strs).sorted((a,b)->Integer.compare(b.length(),a.length())).findFirst().orElse("None"));

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
