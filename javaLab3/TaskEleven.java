public class TaskEleven
{
  public static void main (String [] args)
  {
    double cycle = 200;
    double jog   = 475;
    double swim  = 275;

    double tcycle  = 6;
    double tjog    = 24;
    double tswim   = 12;

    double pounds = (((cycle*tcycle)+(jog*tjog)+(swim*tswim))/3500);
    System.out.println(pounds);
  }
}
