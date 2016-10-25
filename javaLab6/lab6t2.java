//12 hour to 24 hour conversion
import java.util.Scanner;

public class lab6t2
{
  public static void main (String [] args)
  {
    int hours, mins, ampm;
    String stub = new String ("");
    Scanner in = new Scanner (System.in);

    System.out.println("Enter value for hours");
    hours = Integer.parseInt(in.nextLine());
    System.out.println("Enter value for minutes");
    mins = Integer.parseInt(in.nextLine());
    System.out.println("Enter value for AM/PM (1=AM, 2=PM)");
    ampm = Integer.parseInt(in.nextLine());

    int nhours = 0;

    if (ampm >0 && ampm < 3)
      {
        if (ampm == 1)
        {
          nhours = hours;
        }
        if (ampm == 2)
        {
          nhours = hours + 12;
        }
      }
    else
      {
        System.out.print("Invalid Input");
      }

    if (hours >=0 && hours <= 12 && mins >= 0 && mins < 60)
      {
        System.out.println("Time in 12 hour format is: "+nhours+":"+mins);
      }
    else
      {
        System.out.println("Invalid input");
      }





  }
}
