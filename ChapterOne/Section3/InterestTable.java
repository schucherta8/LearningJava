/*
 * Name: Andres Schuchert
 * Date: 4/8/18
 * Purpose: Expand your solution to Exercise 1.2.24 to print a table giving
 * the total amount of money you want have after t years for t = 0 ... 25.
 * Exercise: 1.3.17
*/
public class InterestTable
{
	public static void main(String[] args)
	{
		 int t = 0;
    	double p = Double.parseDouble(args[0]);// p = principal
    	double r = Double.parseDouble(args[1]);// r = rate
    	System.out.println("T\t\tAmount");
    	for(int i = 0; i <= 25; i++)
    	{
    		double amount = (p * (Math.pow(Math.E,r * t)));
    		System.out.println(i + "\t" + amount);
    		t++;
    	}
	}
}