import java.util.Scanner;

public class PromptInput
{
    public static void main(String[] args) 
	{

        // 1. Create a Scanner object connected to standard input
        Scanner scanner = new Scanner(System.in);

        // 2. Read value for A
        System.out.print("Enter Value for A: ");
        int A = scanner.nextInt();

        // 3. Read value for B
        System.out.print("Enter Value for B: ");
        int B = scanner.nextInt();

        // 4. Calculate maximum using the ternary operator
        int C = (A > B) ? A : B;

        // 5. Print the result
        System.out.println("Max = " + C);

        // 6. Close the scanner
        scanner.close();
    }
}



