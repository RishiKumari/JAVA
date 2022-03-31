package complexDecisionMaking;

import java.util.Scanner;

public class BoxerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the weight in pounds.");
       double weight=scan.nextInt();
       if(weight<115) {
    	   System.out.println("Flyweight");
       }
       else if(weight>=115 && weight<=121) {
    	   System.out.println("Bantamweight"); 
       }
       else if(weight>=122 && weight<=153) {
    	   System.out.println("Featherweight"); 
       }
       else if(weight>=154 && weight<=189) {
    	   System.out.println("Middleweight"); 
       }
       else {
    	   System.out.println("HeavyWeight"); 

       }
		}
	}

}
