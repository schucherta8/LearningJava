//Exercise: 1.2.14
//Program: takes two positive integers as command-line arguments
//and prints true if either evenly divides the other.
public class evenlyDivides
{
  public static void main(String[] args)
  {
    int value1 = Integer.parseInt(args[0]);
    int value2 = Integer.parseInt(args[1]);
    boolean evenlydivide = (value1 % value2 == 0);
    System.out.println(evenlydivide);
  }
}
