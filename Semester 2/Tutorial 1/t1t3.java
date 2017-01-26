import javax.swing.JOptionPane;
public class t1t3
{
  public static void main(String [] args)
  {
    String userInput ="", result, secondLast, pattern = "[a-zA-Z]{1,}", vowels = "aeiou";
    boolean validInput = false;

    while (!(validInput)) //checks if input is single word
    {
      userInput = JOptionPane.showInputDialog(null, "Enter your word");
      userInput = userInput.toLowerCase();
      //make sure that word ends in y!
      if ((userInput == null) || ((userInput.matches(pattern)) && userInput.endsWith("y")))
        validInput = true;
      else
        JOptionPane.showMessageDialog(null,"Invalid Input");
    }

    if (userInput.endsWith("quy")) //check for "quy" ending first
      result = userInput.substring(0, userInput.length()-1) + "ies";
    else
      { //now check if ends with Consonants or vowel 
        secondLast = userInput.substring(userInput.length()-2, userInput.length()-1);

        if (vowels.indexOf(secondLast) != -1)
          result = userInput+"s";
        else
          result = userInput.substring(0,userInput.length()-1) + "ies";
      }

      JOptionPane.showMessageDialog(null,result);

  }
}
