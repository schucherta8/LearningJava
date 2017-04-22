//Exercise: 1.2.21
//Program: takes a double command-line argument t and prints the value of
//sin(2t) + sin(3t)
public class sinMathFormula
{
  public static void main(String[] args)
  {
    double t = Double.parseDouble(args[0]);
    double sum = Math.sin(2 * t) + Math.sin(3 * t);
    System.out.println("Value of sin(2t) + sin(3t): " + sum);
  }
}
