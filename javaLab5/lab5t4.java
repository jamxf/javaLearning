import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t4
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);

    double sBP,dBP;

    System.out.println("Please Enter Systolic Blood Pressure: ");
    sBP = Double.parseDouble(in.nextLine());

    System.out.println("Please Enter Diastolic Blood Pressure: ");
    dBP = Double.parseDouble(in.nextLine());

    double map,map1,diff;

    map = ((sBP +(2*dBP))/3.0);
    map1 = (((sBP-dBP)/3.0)+dBP);

    diff = (map-map1);

    JOptionPane.showMessageDialog(null,"First Formula:\t "+map+"\n Second Formula:\t "+map1+"\n Difference:\t "+diff,"Results",2);

  }
}
