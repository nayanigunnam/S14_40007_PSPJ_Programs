//write a java program to calculate simple interest

public class Simple_interest
{
public static void main(String[] args)
{
double principle = 1000;
double rate = 20;
double time = 3;

 double interest = principle*rate*time/100;

System.out.println("Simple Interest = "+interest);
}
}