//take input, print out of sum of square up to that value
import java.util.Scanner;
public class lab6t6
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);

    int sum = 0;
    int input = 0;

    System.out.println("Enter a value: ");
    input = Integer.parseInt(in.nextLine());

    for (int i = 0; i < input; i++)
      {
        sum = sum + ((i+1)*(i+1));
      }

    System.out.println("All values squared is: "+sum);

  }
}
