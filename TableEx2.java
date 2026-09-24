import java.lang.*;
import java.util.Scanner;
public class TableEx2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		
		int i=0;
		while(i<=10)
		{
			System.out.println( n+" * "+i+" = "+n*i);
			i++;
		}
	}
}