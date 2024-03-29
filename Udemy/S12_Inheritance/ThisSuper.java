class Rectanglet {
    int length;
    int breadth;
    int x = 10;

    Rectanglet(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

class Cuboid extends Rectanglet {
    int height;
    int x = 20;

    Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class ThisSuper {
    public static void main(String[] args) {

        Cuboid c = new Cuboid(10, 5, 15);
        c.display();

    }
}