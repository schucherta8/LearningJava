//Exercise: 1.2.29
//Program: Write a program that takes a date as input and prints the day
//of the week that date falls on.
public class dayofWeek
{
  public static void main(String[] args)
  {
    int m = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    y = y - ((14 - m)/12);
    int x = y + (y/4) - (y/100) + (y/400);
    m = m + 12 * ((14 - m)/12) - 2;
    d = (d + x + (31 * m)/12) % 7;
    System.out.println("0 - Sunday, 1 - Monday, 2 - Tuesday, 3 - Wednesday");
    System.out.println("4 - Thursday, 5 - Friday, 6 - Saturday");
    System.out.println("Day of the week: " + d);
  }
}
