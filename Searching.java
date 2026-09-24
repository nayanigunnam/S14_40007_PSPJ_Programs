//searching if that element exists

import java.util.Scanner;
public class Searching
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements : ");
		int n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter Elements : ");
		for(int i= 0; i<n; i++)
		{
			System.out.print("Element "+i+" is : ");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Element to Search : ");
		int search = sc.nextInt();

		boolean found = false;

		for(int i=0; i<n; i++)
		{
			if(a[i]==search)
			{
				found = true;
			}
		}
		if(found)
		{
			System.out.print("Element found : ");
		}
		else
		{
			System.out.print("Element do not exist ");
		}
	}
}