import java.util.Scanner;
public class NetSalary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Basic Salary = ");
		int salary = sc.nextInt();
		
		float hra = 20*salary/100;
		System.out.println("HRA = "+hra);

		float da = 10*salary/100;
		System.out.println("DA = "+da);

		float netsalary = salary+hra+da;
		System.out.println("Net Salary = "+netsalary);

		sc.close();
	}
}