package com.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {

	  int a1=1;
      int a2=1;
    int a3 = 2,num=1;
	
	  System.out.print(a1+" "+a2); for(int i=1;i<=23;i++) { // without recursion
	  a3=a1+a2; a1=a2; a2=a3; System.out.print(" "+a3); }
	 

}
}