//Exercise: 1.2.23
//Program: Write a program that takes two integer command-line argument
//m and d and prints true if day d of month m is between 3/20 and 6/20
public class correctDate
{
  public static void main(String[] args)
  {
    int m = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);
    boolean rightDate = (m >= 3 && m <= 6 && d > 0 && d < 31);
    rightDate = (m == 6 && d < 20 || m < 6 && d < 31);//Could be merged
    System.out.println(rightDate);
  }
}
