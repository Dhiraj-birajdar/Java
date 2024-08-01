public class ForLoopPrograms {
    public static void main(String[] args) {
        printUptoN(10);
        printFromNTo1(100);
        printEvenUptoN(10);
        printOddUptoN(10);
        printSumUptoN(10);
        printEvenSumUptoN(10);
        printEvenOddSumUptoN(10);
        System.out.println(factorial(5));
        remainderFactors(28);
        System.out.println(isPrime(6));
        fibonacciSeries(10);
    }

    //Q9. print 1 to 10 numbers
    public static void printUptoN(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i + ", ");
        System.out.println();
    }

    //Q10. print 100 to 1 numbers
    public static void printFromNTo1(int n) {
        for (int i = n; i > 0; i--)
            System.out.print(i + ", ");
        System.out.println();
    }

    //Q11. print 1 to 10 even numbers only
    public static void printEvenUptoN(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print((i % 2 == 0 ? i : "") + ", ");
        System.out.println();
    }

    //Q12. print 1 to 10 odd numbers only
    public static void printOddUptoN(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print((i % 2 == 1 ? i : "") + ", ");
        System.out.println();
    }

    //Q13. print sum of 1 to 10 numbers
    public static void printSumUptoN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; sum += i, i++) ;
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }

    //Q14. print sum of 1 to 10 even numbers only
    public static void printEvenSumUptoN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; sum += (i % 2 == 0 ? i : 0), i++) ;
        System.out.println("Sum from 1 to " + n + " even numbers is " + sum);
    }

    //Q15. print sum of 1 to 10 even numbers and sum of 1 to 10 odd numbers.
    public static void printEvenOddSumUptoN(int n) {
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        System.out.println("Sum from 1 to " + n + " even numbers is " + evenSum);
        System.out.println("Sum from 1 to " + n + " odd numbers is " + oddSum);
    }

    //Q16. find factorial of given number
    public static int factorial(int n) {
        return n == 1 ? 1 : factorial(n - 1) * n;
    }

    //Q17. find full remainder factors of given number.
    public static void remainderFactors(int n) {
        System.out.print("Factors of " + n + " are : ");
        for (int i = 1; i <= n / 2; i++)
            System.out.print(n % i == 0 ? i + ", " : "");
        System.out.println(n);
    }

    //Q18. check given number is Prime or not
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //Q19. print fibonacci series.
    public static void fibonacciSeries(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fibonacci series : 0, 1, ");
        for (int i = 3; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + ", ");
        }
        System.out.println();
    }
}
