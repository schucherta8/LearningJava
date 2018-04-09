/*
 * Name: Andres Schuchert
 * Date: 4/8/18
 * Purpose: Write a program that takes an integer command-line argument n,
 * uses Math.random() to print n uniform random values between 0 and 1, and
 * then prints their average value.
 * Exercise: 1.3.10
*/
public class UniformAvgValues
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		double sum = 0, temp = 0;
		for(int i = 0; i < n; i++) 
			sum += Math.random();
		System.out.println("Average: " + sum / n);
	}
}