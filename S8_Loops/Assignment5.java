import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start  : ");
        int s = sc.nextInt();
        System.out.println("Enter difference/ratio  : ");
        int d = sc.nextInt();
        System.out.println("Enter terms  : ");
        int t = sc.nextInt(),g = t;
        System.out.println("");
        for(s=0;t>0;t--,s+=d)
            System.out.print(s+d+", ");
        System.out.println("");
        for(s=1;g>0;g--,s*=d)
            System.out.print(s*d+", ");
        sc.close();
    }    
}
