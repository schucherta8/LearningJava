/*
 * Name: Andres Schuchert
 * Date: 4/9/18
 * Purpose: Write a program to print the instructions for drawing the dragon
 * curves of order 0 through 5.
 * Exercise: 1.2.35
*/
public class DragonCurves
{
	public static void main(String[] args)
	{
		//Recursion without loops or if statements
		System.out.println("Dragon Curve: 0 - 5");
		String dragon = "F";
		String rdragon = "F";//reverse dragon
		String dragon1 = dragon + "L" + rdragon;
		String rdragon1 = dragon + "R" + rdragon;
		String dragon2 = dragon1 + "L" + rdragon1;
		String rdragon2 = dragon1 + "R" + rdragon1;
		String dragon3 = dragon2 + "L" + rdragon2;
		String rdragon3 = dragon2 + "R" + rdragon2;
		String dragon4 = dragon3 + "L" + rdragon3;
		String rdragon4 = dragon3 + "R" + rdragon3;
		String dragon5 = dragon4 + "L" + rdragon4;
		String rdragon5 = dragon4 + "R" + rdragon4;
		System.out.println(dragon);
		System.out.println(dragon1);
		System.out.println(dragon2);
		System.out.println(dragon3);
		System.out.println(dragon4);
		System.out.println(dragon5);
	}
}