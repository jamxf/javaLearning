public class Exam4
{
  public static void main (String [] args)
  {
    int values [] = new int[10];
    for (int i = 0; i < 10; i++)
      {
        values[i] = (int)(Math.random()*31+20);
      }
    reportOnDuplicates(values);
  }

  public static void reportOnDuplicates(int n [])
  {
    boolean dupDetect = false;
    int i =0;
    int j = 0;

    for ( i=0; i<n.length && !dupDetect; i++)
      {
        for ( j = (i+1); j<n.length && !dupDetect; j++)
          {
            if (n[i] == n[j])
              {
                dupDetect = true;
              }
          }
      }

    for (int k = 0; k < n.length; k++)
      {
        System.out.print(n[k]+"\n");
      }

    if (dupDetect == true)
      {
        System.out.println("First pair of duplicates were found at positions: "+i+" and "+j);
      }
    else
      {
        System.out.println("No duplicates were generated");
      }

      System.out.println(1*0/1);
  }
}
