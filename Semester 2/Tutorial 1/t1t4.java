import javax.swing.JOptionPane;
public class t1t4
{
  public static void main(String [] args)
  {
    String userInput = "";
    String pattern = "[a-zA-Z]{1,}"; //word pattern
    String pattern2   = "a|e|i|o|u"; //vowel pattern
    String aChar = "";
    int vCount = 0, cCount = 0 ;
    boolean validInput = false;

    while (!(validInput)) //checks if input is single word
    {
      userInput = JOptionPane.showInputDialog(null, "Enter your word");

      if ((userInput == null) || (userInput.matches(pattern)))
        validInput = true;
      else
        JOptionPane.showMessageDialog(null,"Invalid Input");
    }

    userInput = userInput.toLowerCase(); //convert to lowercase

    for (int i = 0; i < userInput.length(); i++)
    {
      aChar = userInput.substring(i, i+1); //steps through word letter by letter

      if (aChar.matches(pattern2)) //if letter is vowel, increase vCount
        vCount++;
      else
        cCount++;
    }

    JOptionPane.showMessageDialog(null, "Vowels: "+ vCount + "\n Consonants: "+ cCount);

  }
}
