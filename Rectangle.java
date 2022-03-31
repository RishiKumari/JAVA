package cwithjava;
 
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		      Scanner scan=new Scanner(System.in);
		      System.out.println("Enter the value of Length and breadth.");
              int length=scan.nextInt();
              int  breadth=scan.nextInt();
              int Area;
              int Perimeter;	
              Area=length*breadth;
        		System.out.println("The area is "+Area);

              Perimeter=2*(length+breadth);
        		System.out.println("The Perimeter is "+Perimeter);

              if(Area>Perimeter) {
        			System.out.println(" Hence,Area is Greater than Perimeter.");
        		}
        		else {
        			System.out.println("Hence, Perimeter is Greater than Area.");

        		}
              
	}
}

