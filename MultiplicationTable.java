package complexlooping;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the number to print their Table");
      int num=scan.nextInt();
      int table=1;
      for(int i=1;i<=10;i++) {
    	  table=num*i;
          System.out.println(num+ "*" +i+ " = " +table);

      }
	}

}
