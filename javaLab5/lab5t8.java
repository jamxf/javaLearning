import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t8
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);

    double p1, p2, total;
    p1 = 1.25;
    p2 = 0.30;
    total = 0.00;

    int miles = 0;

    System.out.println("Please enter the number of miles driven: ");
    miles = Integer.parseInt(in.nextLine());

    int miles2 = (miles - 100);

    if (miles > 100)
      {
        total = (100*p1);
        total = total+(miles2*p2);
      }
      else
        {
          total = (miles*p1);
        }

    System.out.println("The total cost of "+miles+" miles is: \u20AC"+total );

  }
}
