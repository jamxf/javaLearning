//pint a grid of given char and size
import java.util.Scanner;
public class lab6t8
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);
    int rows,cols;
    char car;

    System.out.print("Enter number of Rows: ");
    rows = Integer.parseInt(in.nextLine());

    if (rows > 0 && rows <= 25)
      {
        System.out.print("Enter number of Columns: ");
        cols = Integer.parseInt(in.nextLine());

        if (cols > 0 && cols <= 25)
          {
            System.out.print("Enter symbol to use: ");
            car = (in.nextLine().charAt(0));

            for (int i = 1; i <= cols; i++)
              {
                for (int j = 1; j <= rows; j++)
                {
                  System.out.print(car);
                }
                System.out.print("\n");
              }
          }
        else
          {
            System.out.println("Invalid Input");
          }
      }

    else
      {
        System.out.println("Invalid Input");
      }
  }
}
