package inheritance;

// Multiple inheritance (through interface)
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Implementing methodA");
    }

    public void methodB() {
        System.out.println("Implementing methodB");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
    }
}

