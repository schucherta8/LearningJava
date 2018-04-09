/*
 * Name: Andres Schuchert
 * Date: 4/8/18
 * Purpose: Write a program that, using one for loop and one if statement,
 * prints the integers from 1,000 to 2,000 with five integers per line.
 * Exercise: 1.3.9
*/
public class PrintIntegers
{
	public static void main(String[] args)
	{
		for(int i = 1000; i <= 2000; i++)
		{
			System.out.print(i + " ");
			if((i + 1) % 5 == 0)
				System.out.println();
		}
		System.out.println();
	}
}