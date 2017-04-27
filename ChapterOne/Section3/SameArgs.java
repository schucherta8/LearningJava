//Exercise: 1.3.1
//Program: Write a program that takes three integer command-line arguments
//and prints equal if all three are equal, and not equal otherwise
public class sameArgs
{
  public static void main(String[] args)
  {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    boolean isEqual = (num1 == num2 && num2 == num3 && num3 == num1);
    System.out.print("The three integers are ");
    if (isEqual == true)
      System.out.println("equal.");
    else
      System.out.println("not equal.");
  }
}
