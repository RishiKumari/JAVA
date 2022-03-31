package com.functions;

import java.util.Scanner;

public class FunctionEx2 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number to find square: ");
     float number1=scan.nextFloat();
     float result=square(number1);
     System.out.println("The square of "+number1+" is: "+result);
	}

	private static float square(float number) {
          float y=number *number;
		return y;
	}

}
