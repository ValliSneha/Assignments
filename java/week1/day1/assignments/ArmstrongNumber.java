package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int calculated=0, remainder, original=num;
		while (num>0)
		{
			remainder=num%10;
			calculated=calculated+remainder*remainder*remainder;
			num=num/10;
		}
		if(calculated==original)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		
	}

}
