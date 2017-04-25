//Exercise: 1.2.28
//Program: Write a program that takes three double command-line arguments
//x, y, and z and prints true if the values are strictly ascending or descending
//false othrewise
public class orderCheck
{
  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double z = Double.parseDouble(args[2]);
    boolean isInorder = (x < y && y < z) || (x > y && y > z);
    System.out.println("Ascending or Descending: " + isInorder);
  }
}
