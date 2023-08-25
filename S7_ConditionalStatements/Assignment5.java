import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter option in words(add sub mul div) : ");
        sc.nextLine();
        String s = sc.next();
        s = s.toLowerCase();
        switch(s)
        {
            case "add":System.out.println(n1+n2);
            break;
            case "sub":System.out.println(n1-n2);
            break;
            case "mul":System.out.println(n1*n2);
            break;
            case "div":System.out.println(n1/n2);
            break;
            default:System.out.println("invalid input");
            break;
        }


    }
    
}
