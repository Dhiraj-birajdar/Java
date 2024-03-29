package student;

import java.util.ArrayList;

public class StudentDriver
{
    int guess(int n){
        int g = 1702766719;
        if(n == g)
            return 0;
        else if(n > g)
            return -1;
        else
            return 1;

    }
     public int guessNumber(int n) {
        // int g = guess(n);
        // if(g == 0)
        //     return n;
        // else if( g == -1)
        //     return guessNumber(n/2);
        // else
        //     return guessNumber()
        for(int g, s = n, i = 1 ;;i++){
            g = guess(s);
            System.out.println(i+"  guess: "+s+"  n: "+n+"  g: "+g);
            if(g == 0)
                return s;
            else if(g == -1){
                n = s;
                s = s/2;
            }
            else
                s = s+(n-s)/2;

        }
    }

    public static void main(String[] args) {
        GuessGame g = new GuessGame();
        System.out.println(g.guessNumber(2126753390));
    }
//    public static void main(String[] args)
//    {
//        ArrayList<Student>s1=new ArrayList<Student>();
//        s1.add(new Student("Shubham",123,"CSE"));
//        int s = Integer.MAX_VALUE + 1;
//        System.out.println(s);
//        System.out.println("dkfjkljf");
//        int a = 8793569631;
//    }
}
