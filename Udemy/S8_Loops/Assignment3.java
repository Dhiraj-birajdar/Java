import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt(), t = n;
        int i = 0;
        for (; n != 0; n /= 10) {
            i = i * 10 + (n % 10);
            // System.out.println(i);
        }
        if (t == i)
            System.out.println(t + " is palindrome number");
        else
            System.out.println(t + " is not palindrome number");

        sc.close();
    }
}
