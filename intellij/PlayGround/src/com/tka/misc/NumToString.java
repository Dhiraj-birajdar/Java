package com.tka.misc;
import java.util.HashMap;
import java.util.Map;

public class NumToString {
    Map<Integer, String> map = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();

    public NumToString(){
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.forEach((k,v) -> map2.put(v,k));
    }

    public static void main(String[] args) {
        NumToString main = new NumToString();

//        Long time = System.currentTimeMillis();
//        main.displayRec(1234567891);
//        time = System.currentTimeMillis() - time;
//        System.out.println("\ndisplayRec() : "+time);
//
//        time = System.currentTimeMillis();
//        main.displayLoop(1234567891);
//        time = System.currentTimeMillis() - time;
//        System.out.println("displayLoop() : "+time);

        main.displayRec("six four one nine one");
    }

    public void displayRec(int n) {
        if(n==0) return ;
        displayRec(n/10);
        System.out.print(map.get(n%10)+" ");
    }

    public void displayLoop(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.insert(0,map.get(n%10)+" ");
            n/=10;
        }
        System.out.println("\n"+sb.toString());
    }








    public void displayRec(String str) {
        if(str.length()<7){
            System.out.print(map2.get(str));
            return;
        }
        displayRec(str.substring(0,str.lastIndexOf(" ")));
        System.out.print(map2.get(str.substring(str.lastIndexOf(" ")+1)));
    }


    public void displayLoop(String str) {
        StringBuilder ans = new StringBuilder();
        for (String s: str.split(" ")){
            ans.insert(0,map2.get(s));
        }
        System.out.println(ans.toString());
    }
}

//demonstrate function overloading with the below functionality
//
//
//when i call display(1) then it should print one
//
//
//when i call display('one') then it should print 1
//
//
//same way it can be display(123) : one two three
//
//
//display('four five six') then it should print 456
//
//
//There can be any number.
//
//Please user proper error handling