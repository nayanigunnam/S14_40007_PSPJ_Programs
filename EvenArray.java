//write a java program to print all the even numbers of the given array -> (10 elements)

import java.util.Scanner;
public class EvenArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		for(int i = 0; i<a.length; i++)
		{
			System.out.print("Element "+i+" is : ");
			a[i] = sc.nextInt();
		}
		
		int even = 0;
		System.out.print("Even numbers are : ");
		for(int x = 0; x<a.length; x++)
		{
			if(a[x]%2 ==0)
			{
				System.out.print(a[x]+" ");
			}
		}
		sc.close();
	}
}