//program to print sum of n numbers
import java.util.Scanner;
public class Sum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		float sum = num*(num+1)/2;
		System.out.print("Sum of first n natural numbers = "+sum);
	}
}