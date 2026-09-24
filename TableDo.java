//22 8 2026
import java.lang.*;
import java.util.Scanner;
public class TableDo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		
		int i=0;
		do
		{
			System.out.println( n+" * "+i+" = "+n*i);
			i++;
		}while(i<=10);
	}
}