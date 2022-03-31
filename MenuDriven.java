package com.switchcase;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
  while(true) {
  Scanner scan=new Scanner(System.in);
  System.out.println("Select the options like 1 or 2 or3 or 4( anyone?).... -\n(1)Factorial,\n(2)prime or not,\n(3)odd or even, \n(4)exit?  ");
  int option=scan.nextInt();
  switch(option)
  {
  case 1:
	           System.out.println("Enter the number to find factorial. ");
	           int number=scan.nextInt();
	           int fact=1;
	           if(number<0) {
		        System.out.println("The factorial of negative number doesn't exists. ");
                }
	           else {
		            for(int i=1;i<=number;i++) {
			        fact=fact*i;}
			        System.out.println(" the  factorial of "+number+" is: "+fact);
		   }
	           break;
		 
	 
  case 2:
	               System.out.println("Enter the number to check prime or not. ");
                    int Pnumber=scan.nextInt();
                    	int prime=0;
                    	for(int j=2;j<=Pnumber/2;j++) {
                    if(Pnumber%j==0) {
						System.out.println("The entered number is not prime.");
						prime++;
					  break;
					}					
				}
                    if(prime==0 &&Pnumber!=1) { 
						 
						System.out.println("The entered number is prime.");
			           
					}break;
                    
  case 3:
	          System.out.println("Enter the number to check odd or even. ");
               int oddeven=scan.nextInt();
               if(oddeven%2==0) {
					System.out.println("The entered number is even.");

               }
               else {
					System.out.println("The entered number is odd.");

               } break;
  
  case 4:
		    System.out.println("choose the correct option.");
		    break;    
	   }
		
	}

}
}
