public class TaskTen
{
  public static void main (String [] args)
  {
    double age = 26;
    double bpm = 72;
    double tbpm = ((0.7*(220-age))+(0.3*bpm));

    System.out.println("Training Heart rate is: "+ tbpm +"BPM");

  }
}
