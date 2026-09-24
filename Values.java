//print askeys values of all alphabets upper and lowercase
import java.util.Scanner;
public class Values
{
	public static void main(String[] args)
	{
		
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i+" = "+(int)i);
		}
		for(char i='a';i<='z';i++)
		{
			System.out.println(i+" = "+(int)i);
		}
	}
}