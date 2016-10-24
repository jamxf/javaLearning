import javax.swing.JOptionPane;

public class sort
{
  public static void main (String [] args)
  {
    int [] values = {10,50,30,40,60,79,99,100};
    int pass,comp,temp,times;
    String results = "";
    boolean sorted = false;
    times = 0;

    for (pass = 1; pass <= (values.length - 1) && !sorted ; pass++, times++)
    {
      sorted = true;
      for (comp = 1; comp <= (values.length - pass); comp++)
      {
        if (values[comp - 1] > values[comp])
        {
          temp = values[comp - 1];
          values[comp-1] = values[comp];
          values[comp] = temp;
          sorted = false;
        }
      }
    }

    for (int i = 0; i < values.length; i++)
    {
      results = results + values[i] + "\n";
    }

    System.out.println("Sorted array :\n"+ results+"\nTimes sorted: "+times);
  }
}
