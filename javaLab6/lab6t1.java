//24 hour to 12 hour time conversion
import java.util.Scanner;

public class lab6t1
{
  public static void main (String [] args)
  {
    int hours, mins;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a value for Hours: ");
    hours = Integer.parseInt(in.nextLine());
    System.out.println("Enter a value for Minutes: ");
    mins = Integer.parseInt(in.nextLine());

    int nhours = 0;
    String ampm = new String ("");

    if (hours >= 0 && hours <= 23 && mins >= 0 && mins <=59)
    {
      if (hours > 12)
      {
        ampm = "PM";
        nhours = hours - 12;
        System.out.println("The time in 12 hour format is: "+nhours+":"+mins+ampm);
      }
      else
      {
        ampm = "AM";
        nhours = hours;
        System.out.println("The time in 12 hour format is: "+nhours+":"+mins+ampm);
      }
    }
    else
    {
      System.out.println("Invalid Input");
    }
  }
}
