package com.functions;

import java.util.Scanner;

public class FactorialThroughFun {

	public static void main(String[] args) {
		while(true) {
      Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number to find the factorial.");
     int num=scan.nextInt();
     int result=factorial(num);
     System.out.println(result);
		}
 	}
	private static int factorial(int num) {
		int fact=1;
		if(num==0||num==1) {
            return 1;
		}
		else {
			for(int i=1;i<=num;i++) {
	       fact=fact*i;
}		
		       System.out.println("The factorial of number is: "+fact);

		return fact;
		
	}
	}
}
