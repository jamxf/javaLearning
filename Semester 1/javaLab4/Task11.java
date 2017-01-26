import java.util.Scanner;
public class Task11
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter hours spent cycling:");
    double tcycle  = Double.parseDouble(in.nextLine());

    System.out.println("Enter hours spent jogging:");
    double tjog  = Double.parseDouble(in.nextLine());

    System.out.println("Enter hours spent swimming:");
    double tswim  = Double.parseDouble(in.nextLine());

    double cycle = 200;
    double jog   = 475;
    double swim  = 275;


    double pounds = (((cycle*tcycle)+(jog*tjog)+(swim*tswim))/3500);
    System.out.println("Total pounds burned: "+pounds);
  }
}
