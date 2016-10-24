import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t3
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);

    double inDol,inEur,outDol,outEur;

    System.out.println("Enter Dollar value to convert to Euro:");
    inDol = Double.parseDouble(in.nextLine());
    System.out.println("Enter Euro value to convert to Dollar:");
    inEur = Double.parseDouble(in.nextLine());

    outEur = (inDol / 1.12786);
    outDol = (inEur * 1.12786);

    JOptionPane.showMessageDialog(null,"\u0024"+inDol+"=\u20AC"+outEur+"\n\u20AC"+inEur+"=\u0024"+outDol,"Conversion Rate",2);


  }
}
