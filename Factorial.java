package looping;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		while(true) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number to find factorial.");
      int num=scan.nextInt();
 	 int fact=1;
     if(num<0) {
    	 System.out.println("Factorial of negative number doesn't exists .");
     }
     else {
    	 for(int i=1;i<=num;++i) {
    		 fact*=i;
    	 }
		 System.out.println(fact);

     }
		}
}
}