import javax.swing.JOptionPane;
public class Task12
{
  public static void main (String [] args)
  {

    double tcycle  = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hours spent cycling:"));
    double tjog  = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hours spent jogging:"));
    double tswim  = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hours spent swimming:"));

    double cycle = 200;
    double jog   = 475;
    double swim  = 275;


    double pounds = (((cycle*tcycle)+(jog*tjog)+(swim*tswim))/3500);
    JOptionPane.showMessageDialog(null,"Total pounds burned: "+pounds);
  }
}
