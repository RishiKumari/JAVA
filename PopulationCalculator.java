package complexlooping;

public class PopulationCalculator {

	public static void main(String[] args) { 
         int pop=100000;
         for(int y=10;y>=1;y--) {
        	 if(y==10) {
        		 System.out.println("The population in "+y+" was  "+pop+".");
        	 }
        	 else {
        		 pop=pop-pop*10/100;
        		 System.out.println("The population in "+y+" was  "+pop+".");

        	 }
         }
	}

}
