package cwithjava;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		while(true)
		{
			int reverseNum=0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the 5 digit number ");
      int num=scan.nextInt();
      int temp=num;
     while(num>0) {
    	  int r=num%10;
    	   reverseNum=(reverseNum*10)+r;
    	   num=num/10;
    	   }      
    	      System.out.println(" the number after reverse is "+reverseNum);	
    	 if(temp==reverseNum) {
    		 System.out.println("The number is Palindrome.");
    	 }
    	 else {
    		 System.out.println("The number is  not palindrome.");

    	 }
	}
}
}



// 