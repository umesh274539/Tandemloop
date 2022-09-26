import java.util.Scanner;

public class Series {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the value of n");
	int n=scan.nextInt();
	int a=1;
	int d=2;
	int c=(a+(n-1)*d);
	for(int i=1;i<=c;i=i+2)
	{
		System.out.println(i);
	}
	
}
}
