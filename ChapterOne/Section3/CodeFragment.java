//Exercise: 1.3.4
//Program: Write a code fragment that prints true if the double variables
//x and y are both strictly between 0 and 1, and false otherwise
public class codeFragment
{
  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    boolean isCorrect = (x > 0 && x < 1 && y > 0 && y < 1);
    System.out.println("Both variables are between 0 and 1: " + isCorrect);
  }
}
