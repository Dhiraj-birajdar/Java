package com.tka.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamQuestionsClasses {
}

class Employee{
    int id;
    int salary;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}

class Transaction {
        private String type;
        private int id;

        public Transaction(int id,String type) {
            this.type = type;
            this.id = id;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "type='" + type + '\'' +
                    '}';
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Transaction that = (Transaction) o;
//            return Objects.equals(type, that.type);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hashCode(type);
//        }
    // Method to create a list of transactions (for demonstration purposes)
    static List<Transaction> createTransactions() {
        return List.of(
                new Transaction(1,"type1"),
                new Transaction(2,"t1"),
                new Transaction(3,"type2"),
                new Transaction(4,"t1"),
                new Transaction(5,"type3"),
                new Transaction(6,"t1")
        );
    }
}

class Person{
    private static int idGen=1;
    private int id;
    private int yob;

    public Person(int yob) {
        this.yob = yob;
        this.id = idGen++;
    }

    public int getYob() {
        return yob;
    }

    static List<Person> getPersons(int n){
        Random r = new Random();
        List<Person> lp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lp.add(new Person(r.nextInt(1990,2020)));
        }
        return lp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", yob=" + yob +
                '}';
    }
}

