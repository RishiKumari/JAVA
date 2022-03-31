package looping;
import java.util.Scanner;
public class OnetoAnotherPower {

	public static void main(String[] args) {
		while(true) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the first number.");
       int first=scan.nextInt();
       System.out.println("Enter the second number.");
       int second=scan.nextInt();
       int result=1;
       
          while(second!=0)     {
    	   result=first*result;
    	   //result=first;
    	   //first=first*1;
    	   second--;
    	   
       }
	   System.out.println(result);

	}
	}
}
