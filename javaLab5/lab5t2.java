import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t2
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);

    double rCircle,lSquare,bTriangle,hTriangle;

    //Get values from user
    System.out.println("Please enter the radius of a circle: ");
    rCircle = Double.parseDouble(in.nextLine());
    System.out.println("Please enter the length of a square: ");
    lSquare = Double.parseDouble(in.nextLine());
    System.out.println("Please enter the base of a triangle: ");
    bTriangle = Double.parseDouble(in.nextLine());
    System.out.println("Please enter the height of a triangle: ");
    hTriangle = Double.parseDouble(in.nextLine());

    double aCircle,aSquare,aTriangle;

    //calculate areas from inputted values
    aCircle = (3.14*(rCircle*rCircle));
    aSquare = (lSquare*lSquare);
    aTriangle = ((bTriangle/2.0)*hTriangle);

    //string for neatness
    String stub = new String("Area of ");
    String stub1 = new String (stub+"Circle: "+aCircle+"\n"+stub+"Square: "+aSquare+"\n"+stub+"Triangle: "+aTriangle);

    JOptionPane.showMessageDialog(null,stub1,"Results of Calculations",2);

  }
}
