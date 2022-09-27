import java.util.Scanner;

public class Multiples {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the size of an array");
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<=n-1;i++)
	{
		System.out.println("please enter the value of "+i);
		a[i]=scan.nextInt();
	}
	int count=0;
	for(int i=0;i<=n-1;i++)
	{
		for(int j=1;j<=9;j++)
		{
		if(a[i]%j==0)
		{
			count++;
		}
		System.out.println("[j:"+count);
		}
	}
	System.out.println(count);
		
}
}
