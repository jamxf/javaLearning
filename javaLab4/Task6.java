import javax.swing.JOptionPane;

public class Task6
{
  public static void main(String [] args)
  {



    int width = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the width of the room:"));

    int length = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the length of the room:"));

    int area = length*width;

    JOptionPane.showMessageDialog(null,"The area of the room is "+area+" square feet.");
  }
}
