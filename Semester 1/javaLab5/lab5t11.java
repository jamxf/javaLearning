import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t11
{
  public static void main (String [] args)
  {
    double t1, t2, t3, total;

    t1    = 62.50;
    t2    = 55.00;
    t3    = 35.75;
    total = 00.00;

    String stub = new String("Enter Ticket Type:");

    int choice = 0;
    int numTick = 0;

    choice= Integer.parseInt(JOptionPane.showInputDialog(null,stub+"\n1. Class 1\n2. Class 2\n3. Class 3","Input",3));

    numTick = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of tickets of ticket type "+choice,"Input",3));

    if (numTick > 5)
    {
      JOptionPane.showMessageDialog(null,"Too many tickets requested, try again","Error",2);
    }

    if (choice == 1)
      {
        total = (t1*numTick);
      }
      if (choice == 2)
        {
          total = (t2*numTick);
        }
        if (choice == 3)
          {
            total = (t3*numTick);
          }

    if (numTick < 5)
    {
    JOptionPane.showMessageDialog(null,"The total cost of "+numTick+" tickets for ticket type "+choice+" is: \u20AC"+total,"Message",2);
    }
  }
}
