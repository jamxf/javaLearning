import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t7
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);

    double p1, p2, total;
    p1 = 0.05;
    p2 = 0.03;
    total = 0.00;

    int copies = 0;

    System.out.println("Please enter the number of copies required: ");
    copies = Integer.parseInt(in.nextLine());

    int copies2 = (copies - 100);

    if (copies > 100)
      {
        total = (100*p1);
        total = total+(copies2*p2);
      }
      else
        {
          total = (copies*p1);
        }

    System.out.println("The total cost of "+copies+" copies is: \u20AC"+total );
  }
}
