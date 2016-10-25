//pyramids
import java.util.Scanner;
public class lab6t7
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);
    int num = 0;

    System.out.print("Enter a number between 5 and 9: ");
    num = Integer.parseInt(in.nextLine());

    if ( num >= 5 && num <=9)
    {
    for (int i = 1; i <= num; i++)
    {
      for (int j = 1 ; j <= i ; j++)
      {
        System.out.print(j);
      }
      System.out.print("\n");
    }

    System.out.println("");

    for (int i = 1; i <= num; i++)
    {
      for (int j = num ; j >= i ; j--)
      {
        System.out.print(j);
      }
      System.out.print("\n");
    }

    }
    else
    {
      System.out.println("Invalid Input");
    }

  }
}
