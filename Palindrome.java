import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int rev = 0;
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int y = n;
		while(n>0)
		{
			x = n%10;
			rev = rev*10 + x;
			n = n/10;
		}
		if(rev==y)
		{
			System.out.println(y+" is a Palindrome");
		}
		else
		{
			System.out.println(y+" is not a Palindrome");
		}
		sc.close();
	}
}