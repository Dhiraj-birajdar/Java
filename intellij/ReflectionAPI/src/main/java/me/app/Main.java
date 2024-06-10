package me.app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
            pascalsTriangle(5);

    }

    static void pascalsTriangle(int n){

        int[][] arr = new int[n][n];
        for(int i=0;i<n; arr[i][0]=1, i++);

        for(int i = 1; i< n; i++){
            for (int j = 1; j < n; j++) {
                arr[i][j]= arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(arr[i][j]!=0?arr[i][j]+" ":" ");
            }
            System.out.println();
        }

	}



    static void meth(){
        Object ob = new Object();
        for(Method m: Object.class.getMethods()){
            System.out.println(m.getName());
        }
        System.err.println("getMethods() : "+Object.class.getMethods().length); //9
        System.err.println("getDeclaredMethods() : "+Object.class.getDeclaredMethods().length); //12
//        System.err.println(String.class.getMethods().length);
    }
}
