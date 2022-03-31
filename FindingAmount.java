package complexlooping;

import java.util.Scanner;

public class FindingAmount {

	public static void main(String[] args) {
		int a;
		for(int i=1;i<=10;i++) {
  Scanner scan=new Scanner(System.in);
   System.out.println("Enter the value of principal(p):");
   int p=scan.nextInt();
   System.out.println("Enter the value of rate(r):");
   int r=scan.nextInt();
   System.out.println("Enter the value of year(n):");
   int n=scan.nextInt();
   System.out.println("Enter the value of compound interest(q):");
   int q=scan.nextInt();
         
         a=p*(1+r/q);
         System.out.println("Amount: "+a);
		
	}
	}
}
