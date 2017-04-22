//Exercise: 1.2.19
//Program: takes two integer command-line arguments a and b
//and prints a random integer between a and b, inclusive.

public class randomInt
{
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]);//min
    int b = Integer.parseInt(args[1]);//max
    double randomNum = Math.random();
    int value = (int) (randomNum * b) + a;
    System.out.println(value);
  }
}
