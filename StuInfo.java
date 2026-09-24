//write a java program to read student details name, rollno.,age, marks of 3 subjects,cal % of the student and display all the info

import java.util.Scanner;

public class StuInfo
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		String name = sc.nextLine();
	
		System.out.print("Age: ");
		int age = sc.nextInt();

		System.out.print("Roll no. : ");
		int rollNo = sc.nextInt();
	
		System.out.print("Maths : ");
		int maths = sc.nextInt();

		System.out.print("Physics : ");
		int phy = sc.nextInt();

		System.out.print("Chem : ");
		int chem = sc.nextInt();
		
		int totalMarks = 390;
		int total = maths+phy+chem;
		float percent = total/totalMarks*100;
		System.out.println("Percentage : ");
		float percentage = sc.nextFloat();

		System.out.println("Name = "+name);
		sc.close();

		}
}
