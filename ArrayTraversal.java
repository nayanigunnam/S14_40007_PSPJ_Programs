public class ArrayTraversal
{
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50};
		
		System.out.println("Array elements are : ");
		
		//Traversing the array
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(i+" Element is "+arr[i]);
		}

		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > 30)
			{ 
 				count++;
			}
		}
		System.out.println("Count : "+count);
		System.out.println("End of the array");
	}
}