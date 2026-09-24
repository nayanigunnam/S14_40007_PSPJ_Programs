//write a java program to find the factorial of given number using recursion

import java.util.Scanner;
public class Fact
{
    static int fact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = fact(n);

        System.out.println("Factorial of " + n + " = " + result);
    }
}