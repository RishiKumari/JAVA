package com.functions;

import java.util.Scanner;

public class Decimal_To_Roman {
	public static void main(String[] args) {
		while(true) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year  to find the roman values of that:");
        int year=scan.nextInt();
        		Roman(year);         
		}
	}
	private static void Roman(int number) {
	    if(number>=1000) {
	    	System.out.print("m");
	    	number-=1000;
	    }
	    if(number>=500) {
	    	System.out.print("d");
	    	number-=500;
	    }
	     if(number>=100) {
	    	System.out.print("c");
	    	number-=100;
	    }
	     if(number>=50) {
	    	System.out.print("l");
	    	number-=50;
	    }
	     if(number>=10) {
	    	System.out.print("x");
	    	number-=10;
	    }
	     if(number>=5) {
	    	System.out.print("v");
	    	number-=5;
	    }
	     if(number>=1) {
	    	System.out.print("i");
	    	number-=1;
	    }
	    	System.out.println(" ");

		return;
	    	
	}
	}
