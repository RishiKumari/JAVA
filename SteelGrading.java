package complexDecisionMaking;

import java.util.Scanner;
public class SteelGrading {

	public static void main(String[] args) {
		while(true) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the hardness of steel.");
       double hardness=scan.nextDouble();
       System.out.println("Enter the Carbon Content of steel.");
       double CarbonContent=scan.nextDouble();
       System.out.println("Enter the Tensile Length of steel.");
       double TensileLength=scan.nextDouble();
       if(hardness>50 && CarbonContent<0.7 && TensileLength>5600 ) {
    	   System.out.println("Steel is graded as 10.");
       }
       else if(hardness>50 && CarbonContent<0.7 && TensileLength<=5600 ) {
    	   System.out.println("Steel is graded as 9.");
       }
       else if(hardness<=50 && CarbonContent<0.7 && TensileLength>5600 ) {
    	   System.out.println("Steel is graded as 8.");
       }
       else  if(hardness>50 && CarbonContent>=0.7 && TensileLength>5600 ) {
    	   System.out.println("Steel is graded as 7.");
       }
       else  if(hardness>50 || CarbonContent<0.7 || TensileLength>5600 ) {
    	   System.out.println("Steel is graded as 6.");
       }
       else if(hardness<=50 && CarbonContent>=0.7 && TensileLength<=5600 ) {
    	   System.out.println("Steel is graded as 5.");
       }
       else {
    	   System.out.println("The grade is below 5.");
       }


 	}
	}
}
 