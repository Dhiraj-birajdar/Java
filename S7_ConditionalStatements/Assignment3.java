import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day no : ");
        int d = sc.nextInt();
        if(d==1)
            System.out.println("Monday");
        else if(d==2)
            System.out.println("Tuesday");
        else if(d==3)
            System.out.println("Wednsday");
        else if(d==4)
            System.out.println("Thursday");
        else if(d==5)
            System.out.println("Friday");
        else if(d==6)
            System.out.println("Saturday");
        else if(d==7)
            System.out.println("Sunday");
        else
            System.out.println("Enter valid day number");

        String url = "http://www.google.com";
        if(url.startsWith("https:"))
            System.out.println("protocol : https");
        else if(url.startsWith("http:"))
            System.out.println("protocol : http");
        else if(url.startsWith("ftp:"))
            System.out.println("protocol : ftp");
        else
            System.out.println("Enter valid url");

        if(url.endsWith(".com"))
            System.out.println("Commercial");
        else if(url.endsWith(".net"))
            System.out.println("network");
        else if(url.endsWith(".gov"))
            System.out.println("Government");
        else if(url.endsWith(".edu"))
            System.out.println("Educational");
        else if(url.endsWith(".org"))
            System.out.println("Organization");
        else
            System.out.println("enter valid url");
        sc.close();
        
    }

}
