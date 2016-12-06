public class Exam5
{
  public static void main (String [] args)
  {
    chooseNumbers(5,50);
    chooseNumbers(2,10);
  }

  public static void chooseNumbers(int num, int maxnum)
  {
    int [] values = new int[num];
    int dupCheck = 0;
    int n = 0;

    for (int i = 0; i < values.length;)
      {
         n = (int)(Math.random()*maxnum+1);
          values[i] = n;

        for (dupCheck=0; values[dupCheck] != n; dupCheck++);

        if (i==dupCheck){
            i++;
        }

      }

    if (num > 2)
      {
        System.out.println("Euro Millions: ");
        for (int i = 0; i < values.length; i++)
          {
            System.out.print(values[i]+"\n");
          }
      }
    else
      {
        System.out.println("Lucky Stars: ");
        for (int i = 0; i < values.length; i++)
          {
            System.out.print(values[i]+"\n");
          }
        }

  }
}
