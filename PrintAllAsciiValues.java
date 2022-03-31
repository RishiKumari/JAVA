package looping;

public class PrintAllAsciiValues {

	public static void main(String[] args) {
                int num;
                for(num=0;num<=255;num++) {
                	char c=(char)num;
                	System.out.println("The number "+num+" results "+c+" in ASCII form. " );
                }

	}

}
