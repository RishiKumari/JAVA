package looping;

import java.util.Scanner;

public class OvertimePay {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the extraworking Hour of an employee. ");
		 int extraworkingHour =scan.nextInt();
         System.out.println("Enter the total employee number.");
         int employeeNo=scan.nextInt();

		 int result=1;
		 
			 if(extraworkingHour!=0) {
				result= extraworkingHour*12*employeeNo;
				 System.out.println(result);

			 }
			 else {
				 System.out.println(" hello");
			 }

		 }

	}


