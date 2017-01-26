import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t6
{
  public static void main (String [] args)
  {

    Scanner in = new Scanner(System.in);

    int d1, d2, d3, d4, min;

    System.out.println("Enter four integers");

    System.out.println("Enter first integer:");
    d1 = Integer.parseInt(in.nextLine());
    System.out.println("Enter second integer:");
    d2 = Integer.parseInt(in.nextLine());
    System.out.println("Enter third integer:");
    d3 = Integer.parseInt(in.nextLine());
    System.out.println("Enter fourth integer:");
    d4 = Integer.parseInt(in.nextLine());

    min = d1;

    if (min > d2)
    {
      min = d2;
    }

    if (min > d3)
    {
      min = d3;
    }

    if (min > d4)
    {
      min = d4;
    }

    System.out.println("The minimum value entered is: "+min);
  }
}
