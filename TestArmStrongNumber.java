package looping;
//import ArmstrongNumber;
public class TestArmStrongNumber {

	public static void main(String[] args) {
		int num=2;
		int armst;
		System.out.println("The Armstrong number between 1 and 500 are: ");
		while(num<500) {
			
			armst=armstrongOrNot(num);
		
		if(armst==num) 
			System.out.println(num);
			num++;
			//System.out.println("hello");
			}
	}
	
	static int armstrongOrNot(int num)
	{
	int r,result=0;	
			while(num!=0) {
				r=num%10;
				result=result+(r*r*r);
				num=num/10;
				//System.out.println("Hi");
			}
		
		
		return result;
		
	}
}

	




