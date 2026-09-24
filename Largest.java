import java.util.Scanner;
public class Largest
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
		int largest = a[0];
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>largest)
			{
				largest = a[i];
			}
		}
		System.out.println("Largest number = "+largest);
		sc.close();
	}
}
