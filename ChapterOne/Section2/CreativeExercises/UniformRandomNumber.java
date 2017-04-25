//Creative Exercise: 1.2.30
//Program: Write a program that prints five uniform random numbers between
//0 and 1, their average value, their min and max values
public class uniformRandomNumber
{
  public static void main(String[] args)
  {
    double num1 = Math.random();
    double num2 = Math.random();
    double num3 = Math.random();
    double num4 = Math.random();
    double num5 = Math.random();
    System.out.println("Value 1: " + num1);
    System.out.println("Value 2: " + num2);
    System.out.println("Value 3: " + num3);
    System.out.println("Value 4: " + num4);
    System.out.println("Value 5: " + num5);
    double sum = (num1 + num2 + num3 + num4 + num5)/ 5;
    System.out.println("Average: " + sum);
    sum = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
    System.out.println("Max: " + sum);
    sum = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
    System.out.println("Min: " + sum);
  }
}
