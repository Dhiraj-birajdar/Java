package inheritance;

class A1 {
    void displayA1() {
        System.out.println("Class A1");
    }
}

class B1 extends A1 {
    void displayB1() {
        System.out.println("Class B1");
    }
}

class C1 extends B1 {
    void displayC1() {
        System.out.println("Class C1");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.displayA1();
        obj.displayB1();
        obj.displayC1();
    }
}

