package complexDecisionMaking;

import java.util.Scanner;

public class TypesOfTriangle {

	public static void main(String[] args) {
		while(true) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the angles of triangle.");
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int sum=a+b+c;
    if(a!=0 && b!=0 && c!=0) {
    if(a==b && b==c && c==a) {
    	if(sum==180) {
    		System.out.println("The triangle is equilateral.");
    	}
    	else {
        	System.out.println("Not a triangle.");
        }
    }
    
    else if(a==90 || c==90 || b==90) {
	    if(b==c|| b!=c && a==c || a!=c && a==b ||a!=b) {
	    	if(sum==180) {
	System.out.println("The triangle is Right-angled Triangle.");
   }
     }
       else {
	       System.out.println("Not a triangle.");
            }
      }   

    else if(a==90  && b==90  && c==90)
    {
    	System.out.println("It's not a triangle.");
    }
    else if(a==180  && b==180  && c==180)
    {
    	System.out.println("It's a straight line.");
    }
    else  if((a==b || a==c || b==c) && (a!=0 && b!=0 && c!=0)) {
    	 if(sum==180 && sum!=90) { 

    	System.out.println("The triangle is isosceles.");
    	}
    	 else  {
    	    	System.out.println("Not a triangle.");
    	    }
    }
    
    
    else if(a!=b && b!=c && c!=a) {
    	if(sum==180) {
    	System.out.println("The triangle is Scalene.");
    }
    	else if(sum!=180)
    	{
        	System.out.println("Not a triangle.");
        }
    }
    /*
    else if(a==90 ||b==90 || c==90 && a==0 || b==0 && b==0 || c==0 && c==0 || a==0) {
    	
    		if(sum==90) {
    			System.out.println("Not a triangle.");
    		}
    	}
    	else if(a==0  && b==0  && c==0)
    {
    	System.out.println("It's not a triangle.");
    }
    */
    
    }
      else {
      	System.out.println("Not a triangle.");
      } 
   }
	}
}

