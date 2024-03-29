import java.lang.*;
import java.util.Scanner;

class ReadInput
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name : ");
        String n = s.nextLine();
        // boolean name = s.hasNextInt();
        System.out.println("hello "+n);
        First f = new First();
        
    }
}

/*
nextByte();
nextShort();
nextInt();
nextLong();
nextFloat();
nextDouble();
next();       to get single word
nextLine();   to get whole line
nextBoolean();

hasNextInt();  returns true if input is int else false
hasNextFloat();  returns true if input is float else false
*/