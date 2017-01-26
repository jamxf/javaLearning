
import java.util.Scanner;
public class TaskFourteen
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number: ");

    double n = Double.parseDouble(in.nextLine());
    int inn = (int)n;
    double sum = ((1+n)/2)*n;
    int isum = (int)sum;
    System.out.println("\nThe sum of the first first "+inn+" numbers is:"+isum+"\n");
    double j = 0;
    double k = 0;

    System.out.println("Proof:\n");

    for (double i = n; i>0; i--)
      {
        System.out.println(j+"+"+i+"="+(i+j));
        j = (i+j);


      }
      System.out.println("");
  }
}
