package practicalhw;

public class Pattern {

    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        printPattern1(5);

        System.out.println("\nPattern 2:");
        printPattern2(5);

        System.out.println("\nPattern 3:");
        printPattern3(5);

        System.out.println("\nPattern 4:");
        printPattern4(5);

        System.out.println("\nPattern 5:");
        printPattern5(5);
        
        System.out.println("\nPattern 6:");
        printPattern6(5);
        
        System.out.println("\nPattern 7:");
        printPattern7(5);
        
        System.out.println("\nPattern 8:");
        printPattern8(5);
    }

    // Pattern 1
    public static void printPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void printPattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

   // Pattern 3
    public static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j<=n-i?"  ": "* ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void printPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j>=i?"* ": "  ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void printPattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-1; j++) {
                System.out.print(j<=n-i?"  ": "* ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern 6
    public static void printPattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j>=i?"* ":"  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print(k>=i?"* ": "  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j<=i?"* ":"  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(j<=n-i?"  ": "* ");
            }
            System.out.println();
        }
    }
    // Pattern 7
    public static void printPattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    // Pattern 8
    public static void printPattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

