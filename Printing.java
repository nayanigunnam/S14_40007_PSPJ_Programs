//write a java program to copy one array elements into another array.

import java.util.Scanner;
public class Printing
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int[] a = new int[4];
		int[] b = new int[4];
		for(int i = 0; i<a.length; i++)
		{
			System.out.print("Element "+i+" is : ");
			a[i] = sc.nextInt();
		}
		for(int x = 0; x<a.length; x++)
		{
			b[x] = a[x];
		}
		for(int x =0; x<b.length; x++){
			System.out.print(b[x]+" ");
		}
sc.close();
}
}
