//Creative exercise: 1.2.32
//Program: Take three integers - r, g, b - from the command line
//print the equivalent CMYK values.
public class rGBtoCMYK
{
  public static void main(String[] args)
  {
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    double w = Math.max(r / 255.0, Math.max(g / 255.0, b / 255.0));
    double c = (w - (r / 255.0)) / w;
    double m = (w - (g / 255.0)) / w;
    double y = (w - (b / 255.0)) / w;
    double k = 1.0 - w;
    System.out.println("Cyan(C): " + c);
    System.out.println("Magenta(M): " + m);
    System.out.println("Yellow(Y): " + y);
    System.out.println("Black(K): " + k);
  }
}
