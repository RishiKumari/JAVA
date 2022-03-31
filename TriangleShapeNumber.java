package complexlooping;

public class TriangleShapeNumber {

	public static void main(String[] args) {

		int j;int num=1;
		for(int i=0;i<=4;++i) {
			for(j=0;j<i;++j) {
				System.out.print(" ");
				System.out.print("   "+num);
               num++;
				}
			System.out.println("");
		}
		
		
	}

}
//}

/*
 * Write a program to produce the following output:
 *  1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */