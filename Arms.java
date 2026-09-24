//1)write A PROGRAM TO FIND WHETHER THE GIVEN NUMBER IS armstromg number: 153 is a Armstrong number,individual numbers cube is equal to sum
//upto thousand

import java.lang.*;
public class Arms
{
	public static void main(String[] args)
	{
		
		int temp,x,rev;
				
		for(int n = 0; n<=1000; n++)
		{
			temp = n;
			rev = 0;
 
			while(temp > 0)
			{
				x = temp % 10;
				rev = rev+(x*x*x);
				temp = temp/10;
			}
			if(rev==n)
			{
				System.out.println(n+" is an Armstrong number");
			}
		}
	}
}