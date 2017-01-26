// take in 10 numbers and display sum
import java.util.Scanner;
public class lab6t5
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);

    int [] values = new int [10];
    int pass = 10;
    int sum = 0;

    for (int i = 0; i < pass; i++)
    {
      System.out.println("Enter value "+i+":");
      values[i]=Integer.parseInt(in.nextLine());
    }

    for (int i = 0; i < pass; i++)
    {
      sum = sum + values[i];
    }
    
    System.out.println("The sum of all values entered is: "+sum);
  }
}
