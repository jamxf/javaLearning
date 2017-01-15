//take cmd line arg dictating how many random numbers, double them, print them

public class test
{
  public static void main (String [] args)
  {
    System.out.println(); //for space, to make things look nice
    int x = Integer.parseInt(args[0]); //takes in first command line argument
    int [] z = new int [x]; //declare new array z, the length of the cmd line argument

    for (int i = 0; i < x; i++)
    //generates x random numbers, and puts those numbers into array z
    {
      z[i] = (int)(Math.random()*50)+1;
      System.out.print(z[i]+" "); //prints original values
    }

    System.out.println(); //for space, to make things look nice
    int b [] = doubling(z); //creates an array that is filled in method "doubling"
    printing(b); //send the array b to method "printing"

    Boolean newValid = theName(z);
    System.out.println(newValid); //testing passing booleans back from method
  }

  public static int [] doubling (int [] a) //takes in an array and names it a
  {
    int [] b = new int [a.length]; //creates new array the same length as a

    for (int i = 0; i < a.length; i++)
    //steps through each value of a, doubles it and stores it in b
    {
      b[i] = (a[i]*2);
    }

    return b; //sends array b back to main method
  }

  public static void printing (int [] b)
  {
    System.out.println(); //for space, to make things look nice
    for (int i = 0; i<b.length;i++)
    {
      System.out.print(b[i]+" "); //prints doubled values
    }
    System.out.println(); //for space, to make things look nice
  }

  public static Boolean theName (int [] values)
  {
    if (values.length > 10)
    {
       return  true;
    }
    else
    {
      return false;
    }
  }

}
