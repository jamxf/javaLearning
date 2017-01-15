import java.text.*;
import javax.swing.JOptionPane;

public class Poker
{
  static String userMessage = "";
  static final int handSize = 5;
  static double totalWinnings = 0.0;

  public static void main (String [] args)
  {
    int [] cards  = new int[handSize];
    int [] suits  = new int[handSize];
    int [] values = new int[handSize];

    int winType, choice, endGame = 0;

    String menuMessage1  = "1. Play Poker\n0. Quit";
           menuMessage1 += "\nPlease enter your selection";
    String menuMessage2  = "Would you like to play another game (y/n/Y/N)?";
    String errorMessage1 = "Invalid selection - please try again \n";
    String pattern1   = "0|1", pattern2 = "y|n|Y|N", pattern3 = "n|N";
    String selection  = "", playAgain   = "";

    do
    {
      while (!(selection.matches(pattern1)))
      {
        selection = JOptionPane.showInputDialog(null, menuMessage1);
        if (selection == null)
          selection = "0";
        else if (!(selection.matches(pattern1)))
          JOptionPane.showMessageDialog(null, errorMessage1);
      }

      choice = Integer.parseInt(selection);

      if (choice == 1)
      {
        userMessage = "";
        generateUniqueHand(cards);
        determineSuitsAndValuesOfCards(cards,suits,values);
        orderValuesAndSuits(suits,values);
        displayCardsToEndUser(suits,values);
        winType = evaluateHandOfCards(suits,values);
        displayTypeOfWinIfAny(winType);
        displayAmmountWonIfAnything(winType);
        JOptionPane.showMessageDialog(null,userMessage);

        do
        {
          playAgain = JOptionPane.showInputDialog(null,menuMessage2);
          if (playAgain == null)
            endGame = 1;
          else if (!(playAgain.matches(pattern2)))
            JOptionPane.showMessageDialog(null,errorMessage1);
          else if (playAgain.matches(pattern3))
            endGame = 1;
          else
            endGame = 2;
        } while (endGame != 1 && endGame !=2); //ends inner do while loop
      }
      else
        endGame = 1;
    } while (endGame == 2); //ends outer do while loop
  } //end of main method


  public static void generateUniqueHand(int [] cards)
  {
    int deckSize = 52, uniqueNumbersRequired = handSize, aRandomNumber;
    int index = 0, duplicateIndex;
    while (index < uniqueNumbersRequired)
    {
      aRandomNumber = (int)(Math.random()*deckSize);
      cards[index] = aRandomNumber;
      duplicateIndex = 0;
      while (cards[duplicateIndex] != aRandomNumber)
        duplicateIndex++;
      if (index == duplicateIndex)
        index++;
    }
  }


  public static void determineSuitsAndValuesOfCards(int [] cards, int [] suits, int [] values)
  {
    for (int i = 0; i < handSize; i++)
      {
        suits[i]  = cards[i] / 13;
        values[i] = cards[i] % 13;
      }
  }


  public static void orderValuesAndSuits(int [] suits, int [] values)
  {
    int pass, comparison, temp;
    boolean sorted = false;

    for (pass = 1; pass <= (handSize - 1) && !sorted; pass++)
    {
      sorted = true;
      for (comparison = 1; comparison <= (handSize - pass); comparison++)
      {
        if (values[comparison-1] < values[comparison])
        {
          temp                  = values[comparison-1];
          values[comparison-1]  = values[comparison];
          values[comparison]    = temp;
          temp                  = suits[comparison-1];
          suits[comparison-1]   = suits[comparison];
          suits[comparison]     = temp;
          sorted                = false;
        }
      }
    }
  }


  public static void displayCardsToEndUser(int[] suits, int [] values)
  {
    for (int i = 0; i < handSize; i++)
    {
      switch (values[i])
      {
        case 0:   userMessage += "Two of ";   break;
        case 1:   userMessage += "Three of "; break;
        case 2:   userMessage += "Four of ";  break;
        case 3:   userMessage += "Five of ";  break;
        case 4:   userMessage += "Six of ";   break;
        case 5:   userMessage += "Seven of "; break;
        case 6:   userMessage += "Eight of "; break;
        case 7:   userMessage += "Nine of ";  break;
        case 8:   userMessage += "Ten of ";   break;
        case 9:   userMessage += "Jack of ";  break;
        case 10:  userMessage += "Queen of "; break;
        case 11:  userMessage += "King of ";  break;
        case 12:  userMessage += "Ace of ";   break;
      }
      switch (suits[i])
      {
        case 0: userMessage += "Clubs\n";     break;
        case 1: userMessage += "Diamonds\n";  break;
        case 2: userMessage += "Hearts\n";    break;
        case 3: userMessage += "Spades\n";    break;
      }
    }
  }


  public static int evaluateHandOfCards(int [] suits, int [] values)
  {
    int winType = 0;
    if (cardsOfSameSuit(suits))
    {
      if (cardsInConsecutiveDescendingSequence(values))
      {
        if (values[0] == 12) winType = 9;
        else winType = 8;
      }
      else winType = 7;
    }
    else
    {
      if (cardsInConsecutiveDescendingSequence(values))
        winType = 5;
      else
        winType = checkOtherPossibleCombinations(values);
    }
    return winType;
  }


  public static boolean cardsOfSameSuit(int suits [])
  {
    boolean sameSuit = true;
    for (int i = 0; (i < suits.length - 1) && sameSuit; i++)
    {
      if (suits[i] != suits[i+1])
        sameSuit = false;
    }
    return sameSuit;
  }


public static boolean cardsInConsecutiveDescendingSequence(int values[])
{
  boolean consecutiveCards = true;
  for (int i = 0; i < values.length-1 && consecutiveCards; i++)
  {
    if (values[i] != values[i+1]+1)
      consecutiveCards = false;
  }
  return consecutiveCards;
}


public static int checkOtherPossibleCombinations(int [] values)
{
  boolean continueCardComparisons;
  int sameKind = 0;
  for (int i = 0; i < values.length - 1; i++)
  {
    continueCardComparisons = true;
    for (int j = i+1; j < values.length && continueCardComparisons; j++)
    {
      if (values[i] == values[j])
        sameKind++;
      else
        continueCardComparisons = false;
    }
  }
  return sameKind;
}

public static void displayTypeOfWinIfAny(int winType)
{
  switch(winType)
  {
    case 0: userMessage += "\nNot a winning hand\n";  break;
    case 1: userMessage += "\nOne pair\n";            break;
    case 2: userMessage += "\nTwo pair\n";            break;
    case 3: userMessage += "\nThree of a kind\n";     break;
    case 4: userMessage += "\nFull House\n";          break;
    case 5: userMessage += "\nStraight\n";            break;
    case 6: userMessage += "\nFour of a Kind\n";      break;
    case 7: userMessage += "\nFlush\n";               break;
    case 8: userMessage += "\nStraight Flush\n";      break;
    case 9: userMessage += "\nRoyal Flush\n";         break;
  }
}


public static void displayAmmountWonIfAnything(int winType)
{
  double[] money = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};
  NumberFormat aFormatter = NumberFormat.getCurrencyInstance();
  userMessage += "\nFor this hand you win: "+ aFormatter.format(money[winType]);
  totalWinnings += money[winType];
  userMessage += "\nTotal winnings to date are: " + aFormatter.format(totalWinnings);
}
}
