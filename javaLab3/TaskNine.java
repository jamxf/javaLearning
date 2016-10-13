public class TaskNine
{
  public static void main (String [] args)
  {
    int var = 123456;
    int d1 = var % 10;
    int d2 = (var/10)%10;
    int d3 = (var/100)%10;
    int d4 = (var/1000)%10;
    int d5 = (var/10000)%10;
    int d6 = (var/100000);

    int sum = d1+d2+d3+d4+d5+d6;

    System.out.println("Sum of all digits in "+var+" is: "+sum);

  }
}
