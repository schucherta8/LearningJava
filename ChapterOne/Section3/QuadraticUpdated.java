//Exerise: 1.3.2
//Program: Write a more general and more robust veresion of Quadratic that
//that prints the roots of the polynomial ax^2 + bxx + c, prints an appropriate
//message if the discriminant is negative, and behaves appropriately if a is zero
public class quadraticUpdated
{
  public static void main(String[] args)
  {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double discriminant = Math.pow(b,2) - (4 * a * c);
    if(discriminant < 0)
      System.out.println("No real roots.");
    else
    {
      discriminant = Math.sqrt(discriminant);
      System.out.println("Roots: " + ((-b + discriminant)/ 2.0 * a) + " " + ((-b - discriminant)/ 2.0 * a));
    }
  }
}
