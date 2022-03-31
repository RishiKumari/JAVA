package com.functions;

import java.util.Scanner;

public class CalPower {

	public static void main(String[] args) {
		while(true) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the base value: ");
int base=scan.nextInt();		
System.out.println("Enter the exponent value: ");
int exponent=scan.nextInt();
int value=calculatePower( base,exponent);
System.out.println("the result is "+value);
	}
	}
private static int calculatePower(int base,int exponent) {
	int result =1;
	while(exponent!=0) {
		result=base*result;
		exponent--;
	}
	System.out.println(result);
    return result;
}


}
