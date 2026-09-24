//31st aug
import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n,temp,x,rev=0;
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		temp = n;
	
		
		while(n>0)
		{
			x = n%10;
			rev = rev+(x*x*x);
			n = n/10;
		}
		if(rev==temp)
		{
			System.out.println(temp+" is an Armstrong number");
		}
		else
		{
			System.out.println(temp+" is not an Armstrong number");
		}
	}
}