package com.switchcase;

import java.util.Scanner;

public class Grace_marks_for_students {

	public static void main(String[] args) {
		while(true) {
    Scanner scan=new Scanner(System.in);
    System.out.println("select the class obtained by the student as: (1)first class,(2) second class,(3) third class.");
    int Class=scan.nextInt();   
    System.out.println("Enter the number of subjects he failed in...");
    int NumberOfSubjects=scan.nextInt();   
    switch(Class)
    {
    case 1:
    	   if(NumberOfSubjects>3) {
    		   System.out.println("he does not get any grace.");
    	   }
    	   else {
    		   System.out.println("The grace is of 5 marks per subjects.");

    	   }
    	   break;
    	   
    case 2:
    	 if(NumberOfSubjects>2) {
  		   System.out.println("he does not get any grace.");
  	       }
  	       else {
  	     	   System.out.println("The grace is of 4 marks per subjects.");
  	       }break;
    case 3:     
  	     if(NumberOfSubjects>1) {
  		   System.out.println("he does not get any grace.");
  	   }
  	   else {
  		   System.out.println("The grace is of 5 marks.");
  	   } break;
  	   
  	 default:
		   System.out.println("The value entered, doesn't get match.Please choose the correct option.");

    }
    
	}
	}
}
