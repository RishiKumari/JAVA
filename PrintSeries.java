package complexlooping;

public class PrintSeries {

	public static void main(String[] args) {
		double fact=1;double sum=0;double total=0;
	 System.out.println("The sum of series (1/1!+2/2!+3/3!+.....+7/7!) are:");
     char c=33;
      for(int i=1;i<=7;i++) {
    	  fact=fact*i;
    	 sum= i/fact;
    	 total+=sum;
      }
      
      System.out.println(total);
      
	}
}
 