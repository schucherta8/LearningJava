/*
 * Name: Andres Schuchert
 * Date: 4/8/18
 * Purpose: Write a program that takes an integer command-line argument n and
 * prints all the positive powers of 2 less than or equal to n. Make sure that
 * your program works properly for all values of n.
 * Exercise: 1.3.16
*/
public class PowersOfTwo
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		if(n < 0)
			System.out.println("Error: Most be positive.");
		else
		{
			for(int i = 0; i <= n; i++)
			{
				System.out.print(i + " to the 2nd is: ");
				System.out.println((int) Math.pow(i,2));
			}
		}
	}
}