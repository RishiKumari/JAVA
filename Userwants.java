package looping;

import java.util.Scanner;

public class Userwants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the starting  number.");
       int start=scan.nextInt();
       System.out.println("Enter the ending number.");
       int end=scan.nextInt();
       int positive=0;
       int negative=0;
       int zero=0;
       for( int i=start;i<=end;i++) {
    	   
    	   if(i<0) {
                negative++;
       	   //System.out.println(i);

    	   }
    	   if(i>0) {
    	   //System.out.println(i);
    	   positive++;
       }

    	   else {
           	   zero++;

    	   }
       	   System.out.println(i);
   
	}

	   System.out.println("The entered +ve,-ve and zero are :"+positive+ " ," +negative+ " ,"+zero);

	}
}
