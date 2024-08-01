public class SimplePrograms {
    public static void main(String[] args) {

        System.out.println(sum(3,4));
        swapWith3rdVar(1,2);
        swapWithout3rdVar(3,4);
    }

    //Q1. sum of 2 variables
    public static int sum(int a, int b){
        return a+b;
    }

    //Q2. swap two integers using third variable.
    public static void swapWith3rdVar(int a, int b){
        System.out.println("Before Swap: a => "+a+" b => "+b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After Swap: a => "+a+" b => "+b);
    }

    //Q3. swap two integers without using third variable.
    public static void swapWithout3rdVar(int a, int b){
        System.out.println("Before Swap: a => "+a+" b => "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a => "+a+" b => "+b);
    }
}
