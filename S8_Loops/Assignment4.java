import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt(), t = n;
        int i = 0;
        String s = "";
        for (; n != 0; n /= 10,i++) {

            s = s + (n % 10);
            // System.out.println(i);
        }
        for(;--i>=0;)
        {
            switch(s.charAt(i))
            {
                case '0': System.out.println("Zero");
                        break;
                case '1': System.out.println("One");
                        break;
                case '2': System.out.println("Two");
                        break;
                case '3': System.out.println("Three");
                        break;
                case '4': System.out.println("Four");
                        break;
                case '5': System.out.println("Five");
                        break;
                case '6': System.out.println("Six");
                        break;
                case '7': System.out.println("Seven");
                        break;
                case '8': System.out.println("Eight");
                        break;
                case '9': System.out.println("Nine");
                        break;
                    
            }
        }
        sc.close();
    }
}
