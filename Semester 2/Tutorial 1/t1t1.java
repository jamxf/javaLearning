import javax.swing.JOptionPane;
public class t1t1
{
  public static void main (String [] args)
  {
    String userInput = "", firstChar, result = "", vowels = "aeiou";
    String pattern = "[a-zA-Z]{1,}"; //any char a-z and A-Z, occuring at least once
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
      firstChar = userInput.substring(0,1);
      firstChar = firstChar.toLowerCase(); //takes first letter and makes it lowercase

      if (vowels.indexOf(firstChar) != (-1)) // if 1st letter is vowel, add "way"
        result = userInput+"way";
      else
        result = userInput.substring(1)+firstChar+"ay";
        //strips out first letter, move to end, add "ay"

      JOptionPane.showMessageDialog(null,result);
    }
  }
}
