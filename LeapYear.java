package com.functions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		while(true) {
     Scanner scan=new Scanner(System.in);
    System.out.println("Enter a year to check, leap year or not. ");
    int year=scan.nextInt();
    int result=CalLeapOrNot(year);
    //System.out.println(result);
		} 
	}
private static int CalLeapOrNot(int year) {
	if (year%4==0) {
	    System.out.println("Entered year is a Leap Year.");
	}
	else {
	    System.out.println("Entered year is not a leap year.");

	}
	return 0 ;
}
}
