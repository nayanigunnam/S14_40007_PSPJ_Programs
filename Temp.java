import java.util.Scanner;
public class Temp //Celsius to farenheit
{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Farenheit = ");
		float farenheit = sc.nextFloat();

		float celsius = (farenheit-32)*5/9;

		System.out.println("Celsius = "+celsius+"\u00B0C");
	}
}
