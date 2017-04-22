//Exercise: 1.2.18
//Program: takes two integers command-line arguments x and y
//and prints the Euclidean distance from the point (x, y) to orgin (0,0)
public class euclideanDistance
{
  public static void main(String[] args)
  {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    double distance =  Math.pow(x - 0.0, 2) + Math.pow(y - 0.0, 2);
    distance = Math.sqrt(distance);
    System.out.println(distance);
  }
}
