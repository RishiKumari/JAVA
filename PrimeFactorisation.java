package com.functions;

import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		while(true) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number to find Prime Factorization.");
    int number=scan.nextInt();	
      int result= PrimeFactorisation(number);
	 //System.out.println(result);

		}
	}
private static int PrimeFactorisation(int number) {
	int i;int calci=1;
	for( i=2;i<=number;i++) {
		if(number%i==0) {
			System.out.println(i);
		}
		if(number%i==0) {
			calci=number/i;
			System.out.println(calci);
            if(calci%i==0) {
            	return i;
            }else {
            	return calci;
            }			
		}
		continue;
	}	
	return calci;	
}
}
