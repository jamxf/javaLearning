import javax.swing.JOptionPane;
public class t1t5
{
  public static void main (String [] args)
  {
    String userInput = "";
    String aChar = "";
    String pattern = "([a-zA-Z]+)|((([a-zA-Z]+\\s)+)[a-zA-Z]+)"; //sentence pattern
    int cost = 0 ;
    double totalCost = 0;
    boolean validInput = false;

    while (!(validInput)) //checks if input is single word
    {
      userInput = JOptionPane.showInputDialog(null, "Enter a phrase");

      if ((userInput == null) || (userInput.matches(pattern)))
        validInput = true;
      else
        JOptionPane.showMessageDialog(null,"Invalid Input");
    }

    userInput = userInput.toLowerCase(); //convert to lowercase

    for (int i = 0; i < userInput.length(); i++)
    {
      aChar = userInput.substring(i, i+1); //steps through word letter by letter

      if (aChar.endsWith(" "))
        cost++;
    }

    cost++; //cost is determined by counting spaces, therefore it needs to be ++ 1 more time
    totalCost = cost * 0.05;
    JOptionPane.showMessageDialog(null, "Cost: \u20ac" + totalCost);

  }
}
