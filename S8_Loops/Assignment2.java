import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt(), t = n;
        int i = 0, c = 0;
        for (; n != 0; n /= 10, i++)
        {
            System.out.println(n + " = " + n % 10);
            c += ((n % 10) * (n % 10) * (n % 10));
        }
        System.out.println(t+" has " + i + " digits");
        if (c == t)
            System.out.println(t + " is armstrong number");
        else
            System.out.println(t + " is not armstrong number");

        sc.close();
    }
}
