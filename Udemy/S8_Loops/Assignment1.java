import java.util.Scanner;
class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no : ");
        int n = sc.nextInt(), ns=0,f=1;
        for(int i=1;i<=10;i++)
            System.out.println(n+" * "+i+" = "+n*i);
        
        for(int i=1;i<=n;ns+=i,f*=i,i++);
            System.out.println("natural sum = "+ns+"\n factorial = "+f);
        sc.close();
    }
}