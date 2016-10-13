import javax.swing.JOptionPane;
import java.util.Scanner;
public class Task1
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to be cubed:");


    int num = Integer.parseInt(in.nextLine());
    int numCubed = num*num*num;
    JOptionPane.showMessageDialog(null,num + " cubed = "+ numCubed);
  }
}
