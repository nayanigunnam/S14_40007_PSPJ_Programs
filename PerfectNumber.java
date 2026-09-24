//2)program to find whether the given number is perfect number or not: factors addition is equal
public class PerfectNumber
{
	public static void main(String[] args)
	{
		for(int i = 1;i <= 1000; i++)
		{
			int sum = 0;
			for(int n = 1; n < i; n++)
			{
				if(i%n == 0)
				{
					sum = sum + n;
				}
			}

			if(sum == i && i > 1)
			{
				System.out.println(i+" is a Perfect Number");
			}
		}
	}
}