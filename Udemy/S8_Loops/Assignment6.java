import java.util.Scanner;
// fibonacci series
public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        System.out.print("0, 1, ");
        for(int ppt = 0, pt = 1,t, i = 0;i<=n;i++)
        {
            t = ppt +pt;
            System.out.print(t+", ");
            ppt = pt;
            pt =t;
        }
    }
}
