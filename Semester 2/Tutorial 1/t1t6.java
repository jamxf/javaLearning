import javax.swing.JOptionPane;
public class t1t6
{
  public static void main(String [] args)
  {
    String userInput = "";
    String pattern = "[a-zA-Z]{1,}"; //word pattern
    String pattern2   = "aeiou"; //vowel pattern
    String aChar = "";
    int score = 0 ;
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

      if (pattern2.indexOf(aChar) != -1) //only adds if letter is a vowel
        score += (pattern2.indexOf(aChar)+1); // adds points based on index of letter + 1
    }

    JOptionPane.showMessageDialog(null, "Score: " + score);

  }
}
