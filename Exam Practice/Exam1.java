public class Exam1
{
  public static void main (String [] args)
  {
    int numbers [];
    numbers = generateNumbers(args);
    displayNumbers (args,numbers);
  }

  public static int [] generateNumbers (String a [] )
  {
    int faces [] = new int [6];
    int howmany = 500;
    int n;
    for (int i = 0;i<howmany;i++)
    {
      n = (int) (Math.random()*6+1);
      faces[n-1]++;
    }
    return faces;
  }

  public static void displayNumbers (String a [] args, int [] n)
  {

  }
}
