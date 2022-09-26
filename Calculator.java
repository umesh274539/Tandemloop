import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("PLease enter the first number");
	double a=scan.nextDouble();
	System.out.println("Please enter the second number");
	double b=scan.nextDouble();
	scan.nextLine();
	System.out.println("Type of operation");
	String s=scan.nextLine();
	if(s.equals("Addition"))
	{
		System.out.println(a+b);
	}
	else if(s.equals("Subtraction"))
			{
				System.out.println(a-b);
			}
	else if(s.equals("Multiplication"))
	{
		System.out.println(a*b);
	}
	else if(s.equals("Division"))
	{
		System.out.println(a/b);
	}
	else
	{
		System.out.println("invalid operation");
	}
}
}
