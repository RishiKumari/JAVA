package complexDecisionMaking;

import java.util.Scanner;

public class TriangleValidationUsingSides {

	public static void main(String[] args) {
		while(true) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the three sides of triangle.");
     int a=scan.nextInt();
     int b=scan.nextInt();
     int c=scan.nextInt();
     if(a+b>c && c>a || c>b) {
    	 System.out.println("The triangle is valid. ");
     }
     else if(b+c>a && a>c || a>b) {
    	 System.out.println("The triangle is valid. ");
     }
     else if(a+c>b && b>a || b>c) {
    	 System.out.println("The triangle is valid. ");
     }     
     else if(a+b>c && a==b && b==c)
      {
    	 System.out.println("The triangle is  valid. "); 
     }
     else {
    	 System.out.println("The triangle is not valid.");
     }
	}
	}
}
