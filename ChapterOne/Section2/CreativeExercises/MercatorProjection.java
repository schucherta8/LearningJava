//Exercise: 1.2.31
//Project: Write a program that takes longitude of the point
//in the center of a map and the latitude and longitude of a point
//from the command-line and prints its projection
public class mercatorProjection
{
  public static void main(String[] args)
  {
    double latitude = Double.parseDouble(args[0]);
    double longitude = Double.parseDouble(args[1]);
    double longitudePoint = Double.parseDouble(args[2]);
    double x = longitude - longitudePoint;
    double y = (0.5 * Math.log(1 + Math.sin(latitude))) / (1 - Math.sin(latitude));
    System.out.println("Latitude: " + latitude);
    System.out.println("Longitude: " + longitude);
    System.out.println("Longitude of a point: " + longitudePoint);
    System.out.println("Projection: (" + x + "," + y + ")");
  }
}
