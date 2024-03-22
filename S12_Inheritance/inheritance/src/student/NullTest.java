package student;

import java.util.Objects;

public class NullTest {
    static void a(NullTest o){
        System.out.println(
                "object"
        );
    }

    static void a(String s){
        System.out.println(
                "String"
        );
    }

    public static void main(String[] args) {
//        NullTest.a(null);
        NullTest n = new NullTest();
//        System.out.println(n.getClass());
//        System.out.println(n.hashCode());
//        System.out.println(n.toString());
//        System.out.println(n);
        String s = "hd";
        Object o ;
//        System.out.println(s.equals(new String("hd")));
        String a = null;
//        System.out.println(a instanceof String);

        Shoe s1 = new Shoe("nike",45.56, 9);
        Shoe s2 = new Shoe("Nike",45.56, 9);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }

}

class Shoe{
    private String name;
    private double price;
    private int size;

    public Shoe(String name, double price, int size) {
//        this.name = name;
        this.name = name.toLowerCase();
        this.price = price;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        Shoe shoe = (Shoe) o;
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return name.hashCode()+ String.valueOf(price).hashCode() + size;
    }
}

