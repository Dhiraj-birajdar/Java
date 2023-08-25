import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day no: ");
        int d = sc.nextInt();
        switch (d) {
            case 1:System.out.println("Mon");
                break;
            case 2:System.out.println("Tue");
                break;
            case 3:System.out.println("Wed");
                break;
            case 4:System.out.println("Thu");
                break;
            case 5:System.out.println("Fri");
                break;
            case 6:System.out.println("Sat");
                break;
            case 7:System.out.println("Sun");
                break;
            default:System.out.println("Invalid day");
                break;
        }

        System.out.println("Enter Month no : ");
        int m = sc.nextInt();
        switch (m) {
            case 1:System.out.println("Jan");
                break;
            case 2:System.out.println("Feb");
                break;
            case 3:System.out.println("Mar");
                break;
            case 4:System.out.println("Apr");
                break;
            case 5:System.out.println("May");
                break;
            case 6:System.out.println("Jun");
                break;
            case 7:System.out.println("Jul");
                break;
            default:System.out.println("Invalid day");
                break;
        }

        System.out.println("Enter URL : ");
        String url = sc.next();
        url = url.substring(url.lastIndexOf(".")+1);
        switch(url){
            case "com":System.out.println("Commercial");
                break;
            case "net":System.out.println("Network");
                break;
            case "org":System.out.println("Organization");
                break;
            default:System.out.println("invalid url");
                break;
        }
    }
    
}
