import java.util.Scanner;

public class InputEx
{
	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Welcome "+name);
	
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: "+age);
		
		sc.close();
	
	}
}