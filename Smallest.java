import java.util.Scanner;
public class Smallest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int f = 0; f<a.length; f++)
		{
			System.out.printf("Element "+f+" is: ");
			a[f] = sc.nextInt();
		}
		System.out.printf("Searching element : ");
		int search = sc.nextInt();

		int found = 0;

		for(int i = 0; i<a.length; i++)
		{
			if(a[i]==search)
			{  
				System.out.println("Element found = "+a[i]);
				found = 1;
			}
		}
		if(found == 1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
