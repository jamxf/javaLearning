import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t9
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);

    int grade = 0;
    String lgrade = new String("");

    System.out.println("Please enter exam result in form 1-100");
    grade = Integer.parseInt(in.nextLine());

    if (grade >= 0 && grade <60)
      {
        lgrade = "F";
      }
      else if (grade >= 60 && grade <69)
        {
          lgrade = "D";
        }
        else if (grade >= 70 && grade <79)
          {
            lgrade = "C";
          }
          else if (grade >= 80 && grade <89)
            {
              lgrade = "B";
            }
            else if (grade >= 90 && grade <=100)
              {
                lgrade = "A";
              }


    System.out.println("Grade achieved: "+lgrade);
  }
}
