/*
 * Name: Andres Schuchert
 * Date: 4/9/18
 * Purpose: Write a program that takes three integer command-line arguments
 * and prints them in ascending order. Hint: Use Math.min() and Math.max()
 * No if statements
 * Exercise: 1.2.34
*/
public class ThreeSort
{
	public static void main(String[] args)
	{
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[1]);
		int val3 = Integer.parseInt(args[2]);
		int high = (int) Math.max(Math.max(val1,val2),val3);
		int low = (int) Math.min(Math.min(val1,val2),val3);
		int mid = (val1 + val2 + val3) - (high + low);
		System.out.print("Ascending Order: " + low + " ");
		System.out.println(mid + " " + high);
		//{1,2,3}, {1,3,2} {2,3,1}, {2,1,3},{3,2,1}, {3,1,2} cases
	}
}