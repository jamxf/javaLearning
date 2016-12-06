//provide a command line argument of a number to generate that number of UPCs and check if valid

public class Exam2
{
  public static void main (String [] args)
  {
    int y = Integer.parseInt(args[0]);
    for (int x = 0; x <= y; x++)
  {
    int cardNumber [] = new int[12];
    String card = "";

    for (int i = 0; i < cardNumber.length; i++)
    {
      cardNumber[i] = (int)(Math.random()*9+1);
      card         += " "+cardNumber[i];
    }

    boolean valid = validateUPC(cardNumber);

    if (valid == true)
      System.out.println("UPC number: "+card+" is a valid UPC ");
    else
      System.out.println("UPC number: "+card+" is an invalid UPC ");
  }
  }

  public static boolean validateUPC(int [] digits)
  {
    int last = digits[(digits.length)-1];
    int step1,step2,step3,step4,step5,check;
    step1 = step2 = step3 = step4 = step5 = check = 0;

    for (int i = 0; i < digits.length - 1; i++)
    {
      if (i % 2 == 0)
        step1 += digits[i];
    }

    step2 = (step1 * 3);

    for (int j = 1; j < digits.length - 1; j++)
    {
      if (j % 2 != 0)
        step3 += digits[j];
    }

    step4 = step3 + step2;
    step5 = step4 % 10;
    check = 10 - step5;

    if (check == last)
      return true;
    else
      return false;
  }
}
