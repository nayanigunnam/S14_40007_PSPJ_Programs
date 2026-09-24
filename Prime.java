import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int i = sc.nextInt();

        if(i <= 1)
        {
            System.out.print(i + " is not a Prime Number");
        }
        else
        {
            int count = 0;

            for(int n = 1; n <= i; n++)
            {
                if(i % n == 0)
                {
                    count++;
                }
            }

            if(count == 2)
            {
                System.out.print(i + " is a Prime Number");
            }
            else
            {
                System.out.print(i + " is not a Prime Number");
            }
        }
        sc.close();
    }
}