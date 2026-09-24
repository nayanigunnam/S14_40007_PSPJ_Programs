import java.util.Scanner;
public class AvgMarks
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Name : ");
		String name = sc.nextLine();

		System.out.print("Roll NO. : ");
		int roll = sc.nextInt();

		System.out.print("Maths : ");
		int m = sc.nextInt();

		System.out.print("Physics : "); 
		int p = sc.nextInt();

		System.out.print("Chemistry : "); 
		int c = sc.nextInt();

		System.out.print("Sanskrit : "); 
		int s = sc.nextInt();

		System.out.print("English : "); 
		int e = sc.nextInt();

		int total = 500;

		float avg = m+p+c+s+e/total;
		System.out.println("Average = "+avg);

		if(avg>=90)
		{
			System.out.println("Garde : O");
		}
		else if(avg>=80)
		{
			System.out.println("Garde : A");
		}
		else if(avg >=70)
		{
			System.out.println("Garde : B");
		}
		else if(avg >=60)
		{
			System.out.println("Garde : C");
		}
		else if(avg >=50)
		{
			System.out.println("Garde : D");
		}
		else if(avg <50)
		{
			System.out.println("Garde : Fail");
		}
	}
}
