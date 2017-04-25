//Exercise: 1.24
//Program: Write a program that calculates and prints the amount of money
//you would have after t years if you invested p dollars
//at an annual rate r.
public class compoundInterest
{
  public static void main(String[] args)
  {
    int t = Integer.parseInt(args[0]);//t = time
    double p = Double.parseDouble(args[1]);// p = principal
    double r = Double.parseDouble(args[2]);// r = rate
    double amount = p * (Math.pow(Math.E,r * t));
    System.out.println("Your continuous compounded interest is: " + amount);
  }
}
