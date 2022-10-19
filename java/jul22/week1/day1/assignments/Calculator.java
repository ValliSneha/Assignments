package jul22.week1.day1.assignments;

public class Calculator {
	public double add(double a,double b)
	{
		return (a+b);
	}
	public double sub(double a,double b)
	{
		return (a-b);
	}
	public double mul(double a,double b)
	{
		return (a*b);
	}
	public double divide(double a,double b)
	{
		return (a/b);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(12.56,24.895345));
		System.out.println(c.sub(12.56,24.895345));
		System.out.println(c.mul(12.56,24.895345));
		System.out.println(c.divide(12.56,24.895345));
		
		

	}

}
