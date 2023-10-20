class Parenti {
    public Parenti() {
        System.out.println("Parent Constrcutor");
    }

}

class Childi extends Parenti {
    public Childi() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Childi {
    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}

public class InheritConst {

    public static void main(String[] args) {
        GrandChild c = new GrandChild();
    }

}