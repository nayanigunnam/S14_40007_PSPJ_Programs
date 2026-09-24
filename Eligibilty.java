import java.lang.*;
public class Eligibilty
{
public static void main(String args[])
	{
	int totalMarks 	= 1000;
	int maths1 	= 126; //150
	int maths2 	= 128; //150
	int eng 	= 186; //200
	int sans 	= 100; //200
	int phy 	= 140; //150
	int chem 	= 140; //150

	float total 	= maths1+maths2+eng+sans+phy+chem;
	float pass 	= total/totalMarks*100;

	if (pass >= 80)	
	{
    		System.out.println("Pass = "+pass);
	} 
	else 
	{
  		System.out.println("Fail = "+pass);
	}
}
}