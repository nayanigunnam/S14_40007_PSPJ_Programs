import java.util.Scanner;
public class PosNeg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int f =0; f<a.length; f++)
		{
			System.out.printf("Element "+f+" is: ");
			a[f] = sc.nextInt();
		}
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>0)
			{
				System.out.println("Positive");
			}
			else if(a[i]==0)
			{
				System.out.println("Zero");
			}
			else
			{
				System.out.println("Negative");
			}
			sc.close();
		}
	}
}