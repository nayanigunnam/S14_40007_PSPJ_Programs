import java.util.Scanner;
public class Distance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Speed of the vehicle = ");
		int speed = sc.nextInt();

		System.out.print("Time Taken = ");
		int time = sc.nextInt();

		float distance = speed*time;
		System.out.println("Distance = "+distance+" km/hr");
	
		sc.close();
	}
}