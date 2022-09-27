import java.util.Scanner;

public class PrimeSeries {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scan.nextInt();
	int count=0;
	for(int i=2;i<=n;i++)
	{
		count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(i);
		}
	}
}
}
