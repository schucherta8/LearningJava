//Exercise: 1.2.20
//Program: that prints the sum of two random integers between 1 and 6
public class sixSideDice
{
  public static void main(String[] args)
  {
    int num1 = (int) (Math.random() * 6) + 1;
    int num2 = (int) (Math.random() * 6) + 1;
    int value = num1 + num2;
    System.out.println(value);
  }
}
