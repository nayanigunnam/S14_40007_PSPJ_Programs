import java.util.Scanner;
public class SumAndAvg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int f = 0; f<a.length; f++)
		{
			System.out.printf("Element "+f+" is : ");
			a[f] = sc.nextInt();
		}
		int sum = 0;

		for(int i = 0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		double avg = (double)sum / a.length;

		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+avg);
		sc.close();
	}
}
