package looping;
import java.util.Scanner;
public class IntToOctal {

	public static void main(String[] args) {
		while(true) {
        Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer number to change into octal.");
		  int num=scan.nextInt();
/*
		// int num=scan.nextInt();
		int r;
		String str=" ";
		char [] result= {'0','1','2','3','4','5','6','7'};
		//int result=0;
		while(num>0) {
			r=num%8;
            str=result[r]+str;
			num/=8;
		}
		System.out.println("the equivalent octal number is  "+result);
		
		*/
	  System.out.println(Integer.toOctalString(num));
		
	}

}
}
