import java.util.Scanner;

public class Task3
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the ammount of minutes worked:");

    int time = Integer.parseInt(in.nextLine());
    int hours = time/60;
    int minutes = time%60;

    JOptionPane.showMessageDialog(null,"Time worked: "+time+"\nHours:"+hours+" Minutes:"+minutes );
  }
}
