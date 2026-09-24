import java.util.Scanner;
public class FirstLast
{
	public static void main(String[] args)
	{
	        Scanner sc = new Scanner(System.in);
	      	int a[] = new int[5];
         	for (int f = 0; f < a.length; f++)
		{
			System.out.printf("Element " + f + " is: ");
			a[f] = sc.nextInt();
	        }
	        System.out.println(a[0]);
		System.out.println(a[a.length - 1]);
		sc.close();
	}
}
