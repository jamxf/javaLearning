import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab5t10
{
  public static void main (String [] args)
    {
      Scanner in = new Scanner(System.in);

      double fixed, c1s1, c1s2, c1s3, c2s1, c2s2, c2s3, c3s1, c3s2, c3s3, total;
      fixed = 10000.00;
      c1s1 = 5600.50;
      c1s2 = 5500.00;
      c1s3 = 6000.00;
      c2s1 = 10600.50;
      c2s2 = 11000.00;
      c2s3 = 13500.00;
      c3s1 = 17000.00;
      c3s2 = 22000.00;
      c3s3 = 25000.00;
      total = 0.0;

      int cat, service;

      System.out.println("Choose Category (1-3): ");
      cat = Integer.parseInt(in.nextLine());
      System.out.println("Choose Service (1-3): ");
      service = Integer.parseInt(in.nextLine());

      if (cat == 1)
        {
          if (service == 1)
            {
              total = c1s1;
            }
            else if (service == 2)
              {
                total = c1s2;
              }
              else if (service ==3)
                {
                  total = c1s3;
                }
                else
                  {
                    System.out.println("Invalid choice");
                  }
        }


                  if (cat == 2)
                    {
                      if (service == 1)
                        {
                          total = c2s1;
                        }
                        else if (service == 2)
                          {
                            total = c2s2;
                          }
                          else if (service ==3)
                            {
                              total = c2s3;
                            }
                            else
                              {
                                System.out.println("Invalid choice");
                              }
                    }

                              if (cat == 3)
                                {
                                  if (service == 1)
                                    {
                                      total = c3s1;
                                    }
                                    else if (service == 2)
                                      {
                                        total = c3s2;
                                      }
                                      else if (service ==3)
                                        {
                                          total = c3s3;
                                        }
                                        else
                                          {
                                            System.out.println("Invalid choice");
                                          }
                                }

        total = (total+fixed);
        System.out.println("The total cost of the is: \u20AC"+total);

    }
}
