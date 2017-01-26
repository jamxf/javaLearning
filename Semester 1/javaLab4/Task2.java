import javax.swing.JOptionPane;
public class Task2
{
  public static void main(String [] args)
  {
    int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number to be cubed"));
    int numCubed = num*num*num;

    JOptionPane.showMessageDialog(null,num + " cubed = "+ numCubed);
  }
}
