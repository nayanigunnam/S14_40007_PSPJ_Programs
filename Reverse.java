import java.util.Scanner;
public class Reverse
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
		for (int i = a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	sc.close();
	}
}
