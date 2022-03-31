package complexDecisionMaking;

import java.util.Scanner;
public class ZodiacSignBasedOnDateAndMonth {

	public static void main(String[] args) {
		while(true) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the month and date.");
        int month=scan.nextInt();
        int date=scan.nextInt();
        if(month>=1 && month<=12) {
        	if(date>=1 && date<=31) {
        		if(month==12 && date>=22 || month==1 && date<=19) {
        			System.out.println("Capricorn");
        		}
        		else if(month==1 && date>=20 || month==2 && date<=17) {
        			System.out.println("Aquarius");
        		}
        		else if(month==2 && date>=18 || month==3 && date<=19) {
        			System.out.println("Pisces");
        		}
        		else if(month==3 && date>=20 || month==4 && date<=19) {
        			System.out.println("Aries");
        		}
        		else if(month==4 && date>=20 || month==5 && date<=20) {
        			System.out.println("Taurus");
        		}
        		else if(month==5 && date>=21 || month==6 && date<=20) {
        			System.out.println("Gemini");
        		}
        		else if(month==6 && date>=21 || month==7 && date<=22) {
        			System.out.println("Cancer");
        		}
        		else if(month==7 && date>=23 || month==8 && date<=22) {
        			System.out.println("Leo");
        		}
        		else if(month==8 && date>=23 || month==9 && date<=22) {
        			System.out.println("Virgo");
        		}
        		else if(month==9 && date>=23 || month==10 && date<=22) {
        			System.out.println("Libra");
        		}
        		else if(month==10 && date>=23 || month==11 && date<=21) {
        			System.out.println("Scorpio");
        		}
        		else if(month==11 && date>=22 || month==12 && date<=21) {
        			System.out.println("Sagittarius");
        		}
        		

        	}
        }
        else {
        	System.out.println("Please enter the valid month and date.");
        }
	}
}
}