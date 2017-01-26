import java.util.Scanner;

public class Task9
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your age:");
    double age = Double.parseDouble(in.nextLine());

    System.out.println("Enter your Resting Heart Rate:");
    double bpm = Double.parseDouble(in.nextLine());

    double tbpm = ((0.7*(220-age))+(0.3*bpm));

    System.out.println("Your Training Heart rate is: "+ tbpm +"BPM");

  }
}
