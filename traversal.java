import java.util.Scanner;

public class Traversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        for (int f = 0; f < a.length; f++) {
            System.out.printf("Element " + f + " is : ");
            a[f] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 30) {
                count++;
            }
        }

        System.out.println("Number of elements greater than 30 = " + count);
    }
}