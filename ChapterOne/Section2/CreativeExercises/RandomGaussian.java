//Exercise: 1.2.27
//Program: Write a program thqt prints a random number r drawn
//from the Guassian distribution
public class randomGaussian
{
  public static void main(String[] args)
  {
    double u = Math.random();
    double v = Math.random();
    double r = Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u));
    System.out.println("Random Number: " + r);
  }
}
