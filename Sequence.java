//4)program to print the given pattern
//5 4 3 2 1
//5 4 3 2
//5 4 3
//5 4 
//5

public class Sequence
{	
	public static void main(String[] args)
	{
		
		for(int i = 5;i>0;i--)
		{
			for(int n = 5;n>=6-i;n--)
			{
				System.out.print(n+" ");
			}
			System.out.println(" ");
		}
	}
}