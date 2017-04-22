//Exercise 1.2.15
//Program: takes three positive integers as command-line arguments
//and prints false if any one of them is greater than or equal to
//the sum of the other two and true otherwise.
//Calculation to decide if its a right angle triangle
public class triangleSides
{
  public static void main(String[] args)
  {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    boolean longerSide = (num1 < num2 + num3) && (num2 < num1 + num3) && (num3 < num1 + num2);
    System.out.println(longerSide);
    //if x >= y + z return false
    //if x < y + z
  }
}
