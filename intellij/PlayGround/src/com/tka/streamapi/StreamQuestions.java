package com.tka.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamQuestions {
    public static void main(String[] args) {
        m1();
        // m2();
        // m3();
        // m4();
        // m5();
        // m6();
        // m7();
        // m8();
        // m9();
        // m10();
        // m11();
        // m12();
        // m13();
        // m14();
        // m15();
        // m16();
        // m17();
        // m18();
        // m19();
        // m20();
    }

    // 1. Create a stream pipeline to group a list of strings by their length.
    static void m1() {
        List<String> ls = Arrays.asList("sdf", "ssf", "ds", "ew", "a", "af", "eeewt", "safjf");

        Map<Integer, List<String>> groupedByLength = ls.stream()
                .collect(Collectors.groupingBy(String::length));

        Map<Character, List<String>> groupedByFirstChar = ls.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        // for(int i:groupedByLength.keySet())
        // System.out.println(groupedByLength.get(i));

        groupedByLength.forEach((k, v) -> System.out.println(k + " : " + v));
        groupedByFirstChar.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    // 2. Write a program to count the number of occurrences of each character in a
    // string using streams.
    static void m2() {
        String s = "akfjsdlkjflkjfkwr";
        Map<Character, Long> charCount = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, List<Character>> charGroup = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c));

        // charCount.forEach((k,v)-> System.out.println(k+" : "+v));
        // charGroup.forEach((k,v)-> System.out.println(k+" : "+v));

        charGroup.forEach((k, v) -> System.out.println(k + " : " + v.size()));
    }

    // 3. Given a list of Employee objects, find the employee with the highest
    // salary using streams.
    static void m3() {
        Random r = new Random();
        List<Employee> le = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            le.add(new Employee(i + 1, r.nextInt(10, 100)));
        }
        System.out.println(le);
        Employee emp = le.stream()
                .reduce((a, e) -> a.salary > e.salary ? a : e)
                .orElse(null);
        System.out.println(emp);
    }

    // 4. Using streams, filter a list of numbers to only include those greater than
    // 10 and then find their average.
    static void m4() {
        Random r = new Random();
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= 10; li.add(r.nextInt(-10, 30)), i++)
            ;
        System.out.println("Before : " + li);
        li = li.stream()
                .filter(n -> n > 10)
                .toList();
        int avg1 = li.stream()
                .reduce((s, i) -> s += i)
                .get() / li.size();
        System.out.println("After : " + li);
        System.out.println(avg1);

        double avg = li.stream().mapToInt(i -> i).filter(i -> i > 10).average().getAsDouble();
        System.out.println(avg);

    }

    // 5. Write a program to concatenate a list of strings into a single string,
    // separated by commas, using streams.
    static void m5() {
        List<String> ls = Arrays.asList("sdf", "ssf", "ds", "ew", "a", "af", "eeewt", "safjf");
        String cs = ls.stream().reduce((a, str) -> a += "," + str).get();
        System.out.println(cs);
    }

    // 6. Using Java Streams, convert a list of strings to a map where the key is
    // the string and the value is its length.
    static void m6() {
        List<String> ls = Arrays.asList("sdf", "ssf", "ds", "ew", "a", "af", "eeewt", "safjf");
        Map<String, Integer> m = ls.stream().collect(Collectors.toMap(s -> s, String::length));
        System.out.println(m);
    }

    // 7. Write a stream operation to flatten a list of lists of integers into a
    // single list of integers.
    static void m7() {
        List<List<Integer>> lli = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 5; lli.add(IntStream.range(r.nextInt(1, 10), 12).boxed().toList()), i++)
            ;
        lli.forEach(l -> System.out.println(l));
        List<Integer> li = lli.stream()
                .flatMap(l -> l.stream())
                .toList();
        System.out.println(li);
    }

    // 8. Given a list of transactions, filter out transactions of a specific type
    // and collect them into a set.
    static void m8() {
        List<Transaction> lt = Transaction.createTransactions();
        Set<Transaction> st = lt.stream()
                .filter(t -> t.getType().equals("t1"))
                .collect(Collectors.toSet());
        System.out.println(st);
    }

    // 9. Create a stream pipeline to find the first name of the oldest person in a
    // list of Person objects.
    static void m9() {
        List<Person> lp = Person.getPersons(5);
        System.out.println(lp);
        Person person = lp.stream()
                .reduce((a, p) -> a.getYob() < p.getYob() ? a : p)
                .get();
        System.out.println(person);
    }

    // 10. Write a program to find the first non-repeating character in a string
    // using streams.
    static void m10() {
        String s = "klsaeienakjfncv";
        // Map<Character, Long> map = s.chars()
        // .mapToObj(c -> (char) c)
        // .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
        // Collectors.counting()));
        // Character c = map.entrySet().stream()
        // .filter(entry -> entry.getValue() == 1)
        // .map(Map.Entry::getKey)
        // .findFirst()
        // .orElse(null);
        // System.out.println(c);

        Character ch = s.chars()
                .mapToObj(c1 -> (char) c1)
                .collect(Collectors.groupingBy(c1 -> c1, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    // 11. Using streams, find the sum of the squares of a list of integers.
    static void m11() {
        int squaresSum = IntStream.range(1, 11).map(i -> i * i).sum();
        System.out.println(squaresSum);
        List<Integer> li = IntStream.range(1, 11).boxed().toList();
        System.out.println(li.stream().map(i -> i * i).reduce((s, i) -> s += i));
    }

    // 12. Write a stream operation to skip the first 5 elements in a list and then
    // print the rest.
    static void m12() {
        List<Integer> li = IntStream.range(1, 11).boxed().toList();
        System.out.println(li.stream().skip(5).toList());
    }

    // 13. Create a stream to generate an infinite sequence of random numbers and
    // print the first 10.
    static void m13() {
        Random random = new Random();
        Stream.generate(() -> random.nextInt(100)).limit(10).forEach(System.out::println);
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
    }

    // 14. Using streams, partition a list of integers into even and odd numbers.
    static void m14() {
        Random random = new Random();
        List<Integer> li = Stream.generate(() -> random.nextInt(100)).limit(10).toList();
        Map<Boolean, List<Integer>> l = li.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        l.forEach((k, v) -> System.out.println(k + " : " + v));

    }

    // 15. Write a program to convert a list of strings to a list of their
    // respective lengths using streams.
    static void m15() {
        List<String> ls = Arrays.asList("sdf", "ssf", "ds", "ew", "a", "af", "eeewt", "safjf");
        List<Integer> li = ls.stream().map(String::length).toList();
        li.forEach(System.out::println);
    }

    // 16. Using streams, find the product of all elements in a list of integers.
    static void m16() {
        Random random = new Random();
        List<Integer> li = Stream.generate(() -> random.nextInt(1, 5)).limit(5).toList();
        System.out.println(li);
        System.out.println(li.stream().reduce((a, i) -> a *= i).get());
    }

    // 17. Create a stream pipeline to collect all unique words from a list of
    // sentences.
    static void m17() {
        List<String> lstrs = Arrays.asList(
                "This is a test",
                "This test is simple",
                "Test cases are important");

        List<String> ls = lstrs.stream()
                .flatMap(words -> Arrays.stream(words.split(" ")))
                .collect(Collectors.toSet()).stream().toList();
        System.out.println(ls);
    }

    // 18. Write a program to filter out null values from a list of strings using
    // streams.
    static void m18() {
        List<String> ls = Arrays.asList("sdf", null, "ds", "ew", null, null, "eeewt", "safjf");
        System.out.println(ls);
        System.out.println(ls.stream().filter(Objects::nonNull).toList());
    }

    // 19. Using streams, merge two lists of integers and remove duplicates.
    static void m19() {
        Random random = new Random();
        List<Integer> l1 = Stream.generate(() -> random.nextInt(1, 5)).limit(5).toList();
        List<Integer> l2 = Stream.generate(() -> random.nextInt(1, 5)).limit(5).toList();
        System.out.println(l1 + "\n" + l2);
        Stream.concat(l1.stream(), l2.stream()).distinct().toList().forEach(System.out::println);
    }

    // 20. Write a stream operation to check if any string in a list starts with a
    // specific prefix.
    static void m20() {
        List<String> ls = Arrays.asList("sdf", "ssf", "ds", "ew", "a", "af", "eeewt", "safjf");
        ls.stream().filter(s -> s.startsWith("s")).toList().forEach(System.out::println);
    }
}
