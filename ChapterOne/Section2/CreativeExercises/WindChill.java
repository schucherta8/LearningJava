//Creative Exercise: 1.2.24
//Program: Write a program that takes two double command-line arguments
//temperature and velocity and prints the wind chill.
//Assume values are in range
public class windChill
{
  public static void main(String[] args)
  {
    double temperature = Double.parseDouble(args[0]);
    double velocity = Double.parseDouble(args[1]);
    double w = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(velocity,0.16);
    System.out.println("Wind chill: " + w);
  }
}
