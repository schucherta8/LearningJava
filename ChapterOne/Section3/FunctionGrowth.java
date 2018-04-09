/*
 * Name: Andres Schuchert
 * Date: 4/8/18
 * Purpose: Write a program that prints a table of the values log(n), n, 
 * n log(n), n^2, n^3, 2^n
 * Exercise: 1.3.12
*/
public class FunctionGrowth
{
	public static void main(String[] args)
	{
		System.out.println("N\tLog(n)\t(n)\tn Log(n)\tn^2\t\tn^3\t\t\t2^n");
		int n = 16;
		for(int i = 0; i < 8; i++)
		{
			System.out.print(n + "\t" + (int) Math.log(n) + "\t");
			System.out.print(n + "\t" + (int) (n * Math.log(n)) + "\t\t");
			System.out.print((int) Math.pow(n,2) + "\t\t");
			System.out.print((int) Math.pow(n,3) + "\t\t\t");
			if(i < 2)
				System.out.println((long) Math.pow(2,n));
			else
				System.out.println();//Value too big for Long Int
			n *= 2;
		}
		System.out.println();
		//Not part of exercise, testing large data
		System.out.println("log(1 billion): " + (int) Math.log(1000000000));
	}
}
//This shows the importance of efficent algorithms