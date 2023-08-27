import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        String s = sc.next();
        if(s.matches("[01]+"))
            System.out.println("Binary Number");
        else if(s.matches("[0-7]+"))
            System.out.println("Octal Number");
        else if(s.matches("[0-9]+"))
            System.out.println("Decimal Number");
        else if(s.matches("[a-fA-F0-9]+"))
            System.out.println("Hexadecimal Number");
        else
            System.out.println("Enter valid number");

        System.out.println("Enter year : ");
        int y = sc.nextInt();
        if(y%4==0)
        {
            if(y%100==0)
            {
                if(y%400==0)
                    System.out.println(y+" is leap year");
                else
                    System.out.println(y+" is not leap year");

            }
            else
                System.out.println(y+" is leap year");
        }
        else
            System.out.println(y+" is not leap year");
        sc.close();
    
    }
    
}
