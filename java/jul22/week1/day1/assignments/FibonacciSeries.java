package jul22.week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1, sum=1;
		System.out.println(firstNum);
		for (int i=1;i<range;i++)
		{
			System.out.println(sum);
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
		}
	}

}
