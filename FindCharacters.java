package complexDecisionMaking;

import java.util.Scanner;

public class FindCharacters {

	public static void main(String[] args) {
		while(true) {
       Scanner scan=new Scanner(System.in);
	   System.out.println("Entered character to check capital,small,digit or special symbol.");
       int num=scan.nextInt();
       if(num>=65 && num<=90) {
    	   System.out.println("Entered character is Capital Letter.");
       }
       else if(num>=97 && num<=122) {
    	   System.out.println("Entered character is Small  Letter.");
       }
       else if(num>=48 && num<=57) {
    	   System.out.println("Entered character is Digit.");
       }
       else if(num>=0 && num<=47 || num>=58 && num<=64 || num>=91 && num<=96 || num>=123 && num<=127) {
    	   
    	   System.out.println("Entered character is Special symbol.");

       }
       else {
    	   System.out.println(" Please Enter valid character .");

       }
	}
	}
}
