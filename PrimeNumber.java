package complexlooping;

//import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
			for(int i = 1; i<=300 ; i++) {
			int prime=0;
			for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						//System.out.println(i);
						prime++;
					break;
					}
					
				}
					if(prime==0 &&i!=1) { 
						 
						System.out.println(i);continue;
			           
					}
			     }
		}
}
	
	
		

	