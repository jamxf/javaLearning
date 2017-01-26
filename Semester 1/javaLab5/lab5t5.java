import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t5
{
  public static void main (String [] args)
  {

    Scanner in = new Scanner(System.in);

    double cat1, cat2, cat3, shipping, total;
    cat1      = 32.50;
    cat2      = 30.00;
    cat3      = 25.75;
    shipping  = 10.00;
    total     = 0.0;

    int choice = 0;

    System.out.println("Cateogry 1: Fitness, Category 2: Computing, Category 3: Arts and Crafts");
    System.out.println("Please choose a category:");
    choice = Integer.parseInt(in.nextLine());

    if (choice == 1)
      {
        total = cat1 + shipping;
      }
      else if (choice == 2)
        {
          total = cat2 + shipping;
        }
        else if (choice == 3)
          {
            total = cat3 + shipping;
          }
          else
            {
              total = 0;
            }

    if (total > 0)
      {
        System.out.println("The total cost (plus shipping) is: \u20AC"+total);
      }
      else
        {
          System.out.println("Incorrect Book Category");
        }
  }
}
