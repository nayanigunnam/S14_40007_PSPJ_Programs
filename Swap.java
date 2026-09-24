//14 aug write a java program to swap two numbers, read the numbers for user

import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
	
		System.out.print("b: ");
		int b = sc.nextInt();

		int c = a;
		a = b;
		b = c;
		System.out.println("A = "+a);
		System.out.print("B = "+b);

		sc.close();
	}
}
