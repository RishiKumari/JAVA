package complexDecisionMaking;

import java.util.Scanner;

public class LeapYearUsingOperator {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the year to check leap or not.");
        int year=scan.nextInt();
            if(year%4==0) {
            	System.out.println("Year is a leap year.");
            }
            else {
            	System.out.println("Year is not a leap year.");

            }
	}

}
