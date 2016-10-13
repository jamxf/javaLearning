import javax.swing.JOptionPane;

public class Task10
{
  public static void main (String [] args)
  {


    double age = Double.parseDouble(JOptionPane.showInputDialog("Enter your age:"));


    double bpm = Double.parseDouble(JOptionPane.showInputDialog("Enter your resting heart rate:"));

    double tbpm = ((0.7*(220-age))+(0.3*bpm));

    JOptionPane.showMessageDialog(null,"Your Training Heart rate is: "+ tbpm +"BPM");

  }
}
