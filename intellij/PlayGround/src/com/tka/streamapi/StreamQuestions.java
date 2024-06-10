package com.tka.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamQuestions {
    public static void main(String[] args) {
//        m1();
//        m2();
//        m3();
//        m4();
//        m5();
//        m6();
//        m7();
//        m8();
//        m9();
//        m10();
    }

//1. Create a stream pipeline to group a list of strings by their length.
    static void m1(){
        List<String> ls = Arrays.asList("sdf","ssf","ds","ew","a","af","eeewt","safjf");

        Map<Integer, List<String>> groupedByLength = ls.stream()
                .collect(Collectors.groupingBy(String::length));

        Map<Character, List<String>> groupedByFirstChar = ls.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));

//        for(int i:groupedByLength.keySet())
//            System.out.println(groupedByLength.get(i));

        groupedByLength.forEach((k,v)-> System.out.println(k+" : "+v));
        groupedByFirstChar.forEach((k,v)-> System.out.println(k+" : "+v));
    }

//2. Write a program to count the number of occurrences of each character in a string using streams.
    static void m2(){
        String s = "akfjsdlkjflkjfkwr";
        Map<Character,Long> charCount = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        Map<Character,List<Character>> charGroup = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c));

//        charCount.forEach((k,v)-> System.out.println(k+" : "+v));
//        charGroup.forEach((k,v)-> System.out.println(k+" : "+v));

            charGroup.forEach((k,v)-> System.out.println(k+" : "+v.size()));
    }

//3. Given a list of Employee objects, find the employee with the highest salary using streams.
    static void m3(){
        Random r = new Random();
        List<Employee> le = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            le.add(new Employee(i+1,r.nextInt(10,100)));
        }
        System.out.println(le);
        Employee emp = le.stream()
                .reduce((a,e)->a.salary>e.salary?a:e)
                .orElse(null);
        System.out.println(emp);
    }

//4. Using streams, filter a list of numbers to only include those greater than 10 and then find their average.
    static void m4(){
        Random r = new Random();
        List<Integer> li = new ArrayList<>();
        for (int i=1;i<=10;li.add(r.nextInt(-10,30)),i++);
        System.out.println("Before : "+li);
        li = li.stream()
                        .filter(n->n>10)
                                .toList();
        int avg1 = li.stream()
                        .reduce((s,i)->s+=i)
                            .get()/li.size();
        System.out.println("After : "+li);
        System.out.println(avg1);

        double avg = li.stream().mapToInt(i->i).filter(i->i>10).average().getAsDouble();
        System.out.println(avg);


    }

//5. Write a program to concatenate a list of strings into a single string, separated by commas, using streams.
    static void m5(){
        List<String> ls = Arrays.asList("sdf","ssf","ds","ew","a","af","eeewt","safjf");
        String cs = ls.stream().reduce((a,str)->a+=","+str).get();
        System.out.println(cs);
    }

//6. Using Java Streams, convert a list of strings to a map where the key is the string and the value is its length.
    static void m6(){
        List<String> ls = Arrays.asList("sdf","ssf","ds","ew","a","af","eeewt","safjf");
        Map<String,Integer> m = ls.stream().collect(Collectors.toMap(s->s,String::length));
        System.out.println(m);
    }

//7. Write a stream operation to flatten a list of lists of integers into a single list of integers.
    static void m7(){
        List<List<Integer>> lli = new ArrayList<>();
        Random r = new Random();
        for(int i=1;i<=5;lli.add(IntStream.range(r.nextInt(1,10), 12).boxed().toList()),i++);
        lli.forEach(l-> System.out.println(l));
        List<Integer> li = lli.stream()
                .flatMap(l->l.stream())
                .toList();
        System.out.println(li);
    }

//8. Given a list of transactions, filter out transactions of a specific type and collect them into a set.
    static void m8(){
        List<Transaction> lt = Transaction.createTransactions();
        Set<Transaction> st = lt.stream()
                .filter(t->t.getType().equals("t1"))
                .collect(Collectors.toSet());
        System.out.println(st);
    }

//9. Create a stream pipeline to find the first name of the oldest person in a list of Person objects.
    static void m9(){
        List<Person> lp = Person.getPersons(5);
        System.out.println(lp);
        Person person = lp.stream()
                .reduce((a,p)->a.getYob()<p.getYob()?a:p)
                .get();
        System.out.println(person);
    }

//10. Write a program to find the first non-repeating character in a string using streams.
//    static void m10(){
//        String s = "klsaeienakjfncv";
//         s.chars()
//                 .mapToObj(c->(char)c)
//                 .filter(c->c.)
//    }
//Using streams, find the sum of the squares of a list of integers.
//Write a stream operation to skip the first 5 elements in a list and then print the rest.
//Create a stream to generate an infinite sequence of random numbers and print the first 10.
//Using streams, partition a list of integers into even and odd numbers.
//Write a program to convert a list of strings to a list of their respective lengths using streams.
//Using streams, find the product of all elements in a list of integers.
//Create a stream pipeline to collect all unique words from a list of sentences.
//Write a program to filter out null values from a list of strings using streams.
//Using streams, merge two lists of integers and remove duplicates.
//Write a stream operation to check if any string in a list starts with a specific prefix.


}
















