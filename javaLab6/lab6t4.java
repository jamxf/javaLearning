//input char and repeat x times
import java.util.Scanner;
public class lab6t4
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);
    char input;
    int loop;

    System.out.println("What character to repeat?: ");
    input = (in.nextLine().charAt(0));
    System.out.println("How many times?: ");
    loop = Integer.parseInt(in.nextLine());


    for (int i = 0; i < loop; i++)
      {
        System.out.print(input);
      }

      System.out.print("\n");
  }
}
