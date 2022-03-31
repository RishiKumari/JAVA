package looping;

import java.util.Scanner;

public class RangeOfList {

	public static void main(String[] args) {
		while(true) {
		int min = 0,max=0;
		int option=1;
     Scanner scan=new Scanner(System.in);
    
     do {
    	 System.out.println("Enter the  number into list. ");
         int num=scan.nextInt();
         if(num<min) 
        	 min=num;
         if(num>max)
        	 max=num;
    	 System.out.println("Do you want to add some more numbers into list.Press 1 for yes or 0 for No.");
    	 option=scan.nextInt();

     }
     while(option==1);
     {
    	  
    	 System.out.println("The Range is::"+ (min-max));
     }
	}

}
}