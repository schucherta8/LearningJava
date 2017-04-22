//Exercise: 1.2.16
//Program: Explain the problem and correct the code.
//Code is to calculate the gravitational force between two objects
public class gravitationalForce
{
  public static void main(String[] args)
  {
    double GRAVITY = 6.674 * Math.pow(10,-11);
    double mass1 = Double.parseDouble(args[0]);
    double mass2 = Double.parseDouble(args[1]);
    double distance = Double.parseDouble(args[2]);
    double sum = GRAVITY * ((mass1 * mass2) / Math.pow(distance, 2));
    System.out.println(sum);
  }
}
