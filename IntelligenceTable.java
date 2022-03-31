package complexlooping;

public class IntelligenceTable {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the values of p,r,n & q : ");
		double i=0;double x;
     for(int y=1;y<=6;y++) {
    	 for( x=5.5;x<=12.5;x+=0.5) {
    		 i=2+(y+(0.5 * x));
    	 		System.out.println("   i = "+i+",      y = "+y+ ",        x = "+x);

    	 }

     }
	}
	}

