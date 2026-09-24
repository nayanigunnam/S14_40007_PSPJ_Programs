//find sum of all array elements
public class ArraySum
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5};

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i]; // sum0+1=1, sum 1+2 =3.....
		}
		System.out.println("Sum of all elements of Array are : "+sum);
		
		int size = arr.length;
		double avg = (double)sum/size;
		System.out.print("Avg : "+avg);
	}
}