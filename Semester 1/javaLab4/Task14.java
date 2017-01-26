import javax.swing.JOptionPane;
public class Task14
{
  public static void main(String [] args)
  {

    int pass = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number to be encrypted:"));
    int d1 = (pass / 1000);
    int d2 = (pass / 100) % 10;
    int d3 = (pass / 10) % 10;
    int d4 = (pass % 10);

    int nd1, nd2, nd3, nd4;

    nd1 = (d1+7)%10;
    nd2 = (d2+7)%10;
    nd3 = (d3+7)%10;
    nd4 = (d4+7)%10;

    JOptionPane.showMessageDialog(null,""+nd3+nd4+nd1+nd2);


  }
}
