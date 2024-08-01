public class ControlStatementPrograms {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isPositive(5));
        System.out.println(max(1,2));
        System.out.println(max(59,5,3));
        numCheck(5);
    }

    //Q4. check given number is even or odd.
    public static boolean isEven(int n) {
        return n % 2 == 0 ? true : false;
    }

    //Q5. check given number is positive or negative.
    public static boolean isPositive(int n) {
        return n > 0 ? true : false;
    }

    //Q6. find maximum from two number.
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    //Q7. find maximum from three number.
    public static int max(int a, int b, int c) {
        return a > b && a > c ? a : b > c ? b : c;
    }

    //Q8. check given number is zero, positive or negative.
    public static void numCheck(int n) {
        if (n == 0)
            System.out.println(n + " : Zero");
        else if (n > 0)
            System.out.println(n + " : Positive");
        else
            System.out.println(n + " : Negative");
    }
}
