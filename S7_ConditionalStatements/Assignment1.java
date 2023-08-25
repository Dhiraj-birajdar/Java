import java.util.Scanner;
class Assignment1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // odd even check
        System.out.println("Enter no : ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");

        // age check
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        if(age<=35 && age>=14)
            System.out.println("you are young");
        else
            System.out.println("you are not young");

        // grade check
        System.out.println("Enter marks of 3 subject : ");
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float average = (m1+m2+m3)/3;
        if(average>=90)
            System.out.println("Grade : O");
        else if(average>=80)
            System.out.println("Grade : A+");
        else if(average>=70)
            System.out.println("Grade : A");
        else if(average>=60)
            System.out.println("Grade : B");
        else if(average>=50)
            System.out.println("Grade : C");
        else if(average>=40)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");


        sc.close();
    }
}