import javax.swing.JOptionPane;
public class t1t2
{
  public static void main(String [] args)
  {
    String userInput = "";
    String pattern   = "[a-zA-Z]{1,}";//any char a-z and A-Z, occuring at least once
    int posA, posB;
    boolean validInput = false;

    while (!(validInput)) //checks if input is single word
    {
      userInput = JOptionPane.showInputDialog(null, "Enter your word");

      if ((userInput == null) || (userInput.matches(pattern)))
        validInput = true;
      else
        JOptionPane.showMessageDialog(null,"Invalid Input");
    }

      if (userInput != null)
      {
        userInput = userInput.toLowerCase();  //convert word to lowercase
        posA = userInput.indexOf("a");        //find 1st "a"
        posB = userInput.indexOf("b");        // find 1st "b"

        if (posA != -1 && posB != -1 && posA <posB)
        //if "a" exists and "b" exists, and "a" is before "b"
          JOptionPane.showMessageDialog(null,"Valid Word");
        else
          JOptionPane.showMessageDialog(null,"Invalid Word");
      }
  }
}
