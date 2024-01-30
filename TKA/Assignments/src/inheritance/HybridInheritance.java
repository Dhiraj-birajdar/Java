package inheritance;

interface X {
    void methodA();
}

class Y {
    void methodB() {
        System.out.println("Class Y - methodB");
    }
}

class Z extends Y implements X {
    public void methodA() {
        System.out.println("Class Z - methodA");
    }

    void displayC() {
        System.out.println("Class Z - displayC");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Z c = new Z();
        c.methodA();
        c.methodB();
        c.displayC();
    }
}

