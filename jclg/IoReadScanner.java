import java.util.Scanner;
import java.io.File;
class IoReadScanner
{
    public static void main(String[] args)
    {
        File f = new File("file.txt");
        File f1 = new File("file1.txt");
        try
        {
            // System.out.println(f1.createNewFile());
            Scanner sc = new Scanner(f);
            System.out.println(sc.nextLine());
            System.out.println(f1.delete());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
} 