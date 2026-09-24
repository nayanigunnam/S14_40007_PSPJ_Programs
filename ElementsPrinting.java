import java.util.Scanner;
public class ElementsPrinting
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int f = 0 ; f<=4; f++)
		{
			System.out.printf("Element " + f + " is : " );
			a[f] = sc.nextInt();
		}
		for(int i = 0 ;i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}