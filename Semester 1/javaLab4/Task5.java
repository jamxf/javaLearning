import java.util.Scanner;

public class Task5
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the width of the room:");
    int width = Integer.parseInt(in.nextLine());

    System.out.println("Enter the length of the room:");
    int length = Integer.parseInt(in.nextLine());

    int area = length*width;

    System.out.println("The room is: "+area+" square feet");

  }
}
