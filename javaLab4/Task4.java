import javax.swing.JOptionPane;

public class Task4
{
  public static void main(String [] args)
  {

    int time = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the ammount of minutes worked:"));

    int hours = time/60;
    int minutes = time%60;

    JOptionPane.showMessageDialog(null,"Time worked: "+time+"\nHours:"+hours+" Minutes:"+minutes );
  }
}
