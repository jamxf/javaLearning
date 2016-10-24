import javax.swing.JOptionPane;
import java.util.Scanner;

public class lab5t1
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);

    double inCel,inFah,outCel,outFah;
    
    String stub1 = new String ("\u2103 is equivalent to ");
    String stub2 = new String ("\u2109 is equivalent to ");

    System.out.println("Enter Celcius value to conver to Fahrenheit:");
    inCel = Double.parseDouble(in.nextLine());
    System.out.println("Enter Fahrenheit value to conver to Celcius:");
    inFah = Double.parseDouble(in.nextLine());

    outCel = ((5.0/9.0)*(inFah-32));
    outFah = (((9.0/5.0)*inCel)+32);

    JOptionPane.showMessageDialog(null,inCel+stub1+outFah+"\u2109"+"\n"+inFah+stub2+outCel+"\u2103","Conversion Results",2);

  }
}
