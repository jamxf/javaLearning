import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t12
{
  public static void main (String [] args)
  {
    Scanner in = new Scanner(System.in);

    int gender = 0;
    System.out.println("Please enter your gender (Female = 1, Male = 2):");
    gender = Integer.parseInt(in.nextLine());

    double w, h, hm;

    System.out.println("Please enter your weight in kg:");
    w = Double.parseDouble(in.nextLine());
    System.out.println("Please enter your height in cm:");
    h = Double.parseDouble(in.nextLine());

    hm = (h/100.00);

    double bmi;
    bmi = (w / (hm*hm));

    String result = new String("");

    if (gender == 1)
      {
        if (bmi < 19)
          {
            result = "Underweight";
          }
          if (bmi > 19 && bmi < 25)
            {
              result = "Acceptable";
            }
            if (bmi > 25 && bmi < 30)
              {
                result = "Overweight";
              }
              if (bmi > 30 && bmi <= 40)
                {
                  result = "Obese";
                }
                if (bmi > 40)
                  {
                    result = "Morbidly Obese..........fatty";
                  }
      }

    if (gender == 2)
    {
      if (bmi < 20)
        {
          result = "Underweight";
        }
        if (bmi > 20 && bmi < 25)
          {
            result = "Acceptable";
          }
          if (bmi > 25 && bmi < 30)
            {
              result = "Overweight";
            }
            if (bmi > 30 && bmi <= 40)
              {
                result = "Obese";
              }
              if (bmi > 40)
                {
                  result = "Morbidly Obese";
                }
    }

      if (w >= 2 && w <= 650 && h >= 30 && h<= 300)
        {
          System.out.println("Based on your input, your BMI is "+bmi+" and you are "+result);
        }
        else
          {
            System.out.println("Invalid Input");
          }

  }
}
