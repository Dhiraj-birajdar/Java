package com.dhiraj.questionbankservice.config;

public class Main
{
	public static void main(String[] args) {
	    int i,j;
	    for(i=1;i<=10;i++){
	        boolean flag=true;
	        for(j=1;j<=9;j++){
	            if(i<=5){
	                if((j>5-i) && (j<5+i) && flag){
	                    System.out.print("*");
	                    flag=false;
	                }
	                else{
	                    System.out.print(" ");
	                    flag=true;
	                }
	            }
	            else{
	                if((j>i-5) && (j<i+5) && flag){
	                    System.out.print("#");
	                    flag=false;
	                }
	                else{
	                    System.out.print(" ");
	                    flag=true;
	                }
	            }
	        }

	        System.out.print("\n");
	    }
	}
}
