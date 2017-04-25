//Creative Exercise: 1.2.26
//Program: Write a program that converts from Cartesian to polar coordinates.
public class polarCoordinates
{
  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double r = Math.sqrt((x * x) + (y * y));
    double theta = Math.atan2(y, x);
    System.out.println("Radical distance: " + r);
    System.out.println("Counterclockwise angle: " + theta);
  }
}
