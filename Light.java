// 28th aug
import java.util.Scanner;
public class Light
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Character(R/Y/G) : ");
		char light = sc.next().charAt(0);
		{
		switch(light) {
		
		case 'R' :
			System.out.println("The light is RED. STOP.");
			break;
		
		case 'Y':
			System.out.println("The light is YELLOW. PREPARE TO STOP.");
			break;	

		case 'G':
			System.out.println("The light is GREEN. PROCEED.");
			break;

		default:
			System.out.print("Invalid Letter");
			}
		sc.close();
		}
	}
}