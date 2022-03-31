package cwithjava;
import java.util.Scanner;
public class PointsInsideCircle {

	public static void main(String[] args) {
		while(true) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the centre and radius of circle.");
        double center=scan.nextInt();
        double radius=scan.nextInt();
       System.out.println("Enter the value of X,Y to find the point lies on circle or not");
       double x=scan.nextInt();
       double y=scan.nextInt();
        if(center>=0 && radius>=0|| radius<=0) {
        	if(x<=center && x>=radius-1 || x<=radius-1) {
        		if(y<=center && y>=radius-1 || y<=radius-1) {      			
        		
        		System.out.println("X and Y lies inside circle.");
        	}
        		else {
                	System.out.println("Points doesn't lies inside a circle.");

        		}
        }
        	else {
            	System.out.println("Points doesn't lies inside a circle.");

        	}

	}
        
        else {
        	System.out.println("Points doesn't lies inside a circle.");
        }
        
	}
}
}