//Exercise: 1.3.5
//Program: Write a program that prints the result of rolling a loaded die such
//that the probability of getting a 1, 2, 3, 4, or 5 is 1/8 and the probability
//of getting a 6 is 3/8
public class rollLoadedDie
{
  public static void main(String[] args)
  {
    double randomNum = Math.random();
    int die = (int) (randomNum * 8) + 1;
    if(die >= 6)
      System.out.println("Die: " + 6);
    else
      System.out.println("Die: " + die);
  }
}
