package cwithjava;

import java.util.Scanner;

public class StraightLine {

	public static void main(String[] args) {
		while (true) {
			// Taking input from user.
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the value of X1 & Y1");
			int X1 = scan.nextInt();
			int Y1 = scan.nextInt();
			System.out.println("Enter the value of X2 & Y2");
			int X2 = scan.nextInt();
			int Y2 = scan.nextInt();
			System.out.println("Enter the value of X3 & Y3");
			int X3 = scan.nextInt();
			int Y3 = scan.nextInt();
			// When points lies on a straight line on Y-axis.
			if (X1 == 0 && Y1 > 0 || Y1 < 0) {
				if (X2 == 0 && Y2 > 0 || Y2 < 0) {
					if (X3 == 0 && Y3 > 0 || Y3 < 0) {
						System.out.println("It's a straight line &  lies on Y-axis.");
					}
				}
			} 
			// When points lies on a straight line on X-axis
			else if (Y1 == 0 && X1 > 0 || X1 < 0) {
				if (Y2 == 0 && X2 > 0 || X2 < 0) {
					if (Y3 == 0 && X3 > 0 || X3 < 0) {
						System.out.println("It's a straight line & lies on X-axis.");
					}
				}
			} 
			// If points is on zero.
			else if (Y1 == 0 && X1 == 0) {
				if (Y2 == 0 && X2 == 0) {
					if (Y3 == 0 && X3 == 0) {
						System.out.println("This is Origin.");
					}
					}
				else {
				System.out.println("Not a straight line.");
			}

		}
		} 		
	}
}

