package com.recursion;

public class Sum_Of_Digits {
public static void main(String[]args) {
	int a=67890;
	//int sum=0;
	int fs=add(a);
	/*int i,r;
	 * for(i=1;i<=5;i++) { r=a%10; sum=sum+r; a=a/10;
	 * 
	 * }
	 */
	System.out.println("The sum of 5 digits number "+a+" are "+ fs);
}

private static int add(int n) {
	// TODO Auto-generated method stub
	//int n;
	int i,r,sum=0;
	  for(i=1;i<=5;i++) 
	  { r=n%10; 
	  sum=sum+r; 
	  n=n/10;	  
	 }
	return sum;
}
}
