//4 aug
import java.lang.*;
public class Bill
{
public static void main(String[] args)
{
int l = 45000;
int m = 500;
int k = 1500;

int sum = l+m+k;

float gst = sum*18/100;

float total = sum+gst;

System.out.println("Total amount for items = "+sum);
System.out.println("GST = "+gst);
System.out.println("Total Bill = "+total);

}
}