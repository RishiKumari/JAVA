package complexDecisionMaking;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		while(true) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the height and weight of person.");
      double weight=scan.nextDouble();
      double height=scan.nextDouble();
      double sqrtheight=height*height;
      double BMI=weight/sqrtheight;
      if(BMI<15) {
    	  System.out.println("Starvation");
      }
      else if(BMI>=15.1 && BMI<=17.5) {
    	  System.out.println("Anorexic");
    	  }
      else if(BMI>=17.6 && BMI<=18.5) {
    	  System.out.println("Underweight");
    	  }
      else if(BMI>=18.6 && BMI<=24.9) {
    	  System.out.println("Ideal");
    	  }
      else if(BMI>=25 && BMI<=25.9) {
    	  System.out.println("Overweight");
    	  }
      else if(BMI>=30 && BMI<=30.9) {
    	  System.out.println("obese");
    	  }
      else if(BMI>=40) {
    	  System.out.println("Morbidly Obese");
    	  }
      else {
    	  System.out.println("Please enter a valid data.");
      }
      
	}
	}
}
