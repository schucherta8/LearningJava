//Problem 1.2.2
public class pythagoreanIdentity
{
  public static void main(String[] args)
  {//Messy way to write it
    double sum = 0;
    sum = (Math.cos(Double.parseDouble(args[0])) * Math.cos(Double.parseDouble(args[0])))+ (Math.sin(Double.parseDouble(args[1])) * Math.sin(Double.parseDouble(args[1])));
    System.out.println(sum);
  }
}
