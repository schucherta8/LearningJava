//Exercise: 1.2.22
//Program: Write a program that takes three double command-line arguments
//x0, v0, and t and prints the value of x0 + v0t + gt^2/2
//g is the constant 9.80665
public class displacementFormula
{
  public static void main(String[] args)
  {
    double x0 = Double.parseDouble(args[0]);
    double v0 = Double.parseDouble(args[1]);
    double t = Double.parseDouble(args[2]);
    double G = 9.80665;
    double sum = x0 + (v0 * t) + ((G * Math.pow(t,2))/2);
    System.out.println("Solution: " + sum);
  }
}
