public class TaskThirteen
{
  public static void main (String [] args)
  {
    System.out.println("\nCurrent Assets of ABC Limited");

    String cash = new String("Cash");
    String pcash = new String("Petty Cash");
    String temp = new String("Temporary");
    String inv = new String("Investments");
    String acc = new String("Accounts Recievable");
    String sup = new String("Supplies");

    System.out.printf("\t%-20s %10.2f\n",cash,2100.10);
    System.out.printf("\t%-20s %10.2f\n",pcash,100.0);
    System.out.printf("\t%-20s %10.2f\n",temp,10000.25);
    System.out.printf("\t%-20s \n",inv);
    System.out.printf("\t%-20s %10.2f\n",acc,25123.45);
    System.out.printf("\t%-20s %10.2f\n",sup,3800.11);

    System.out.println("");

  }
}
