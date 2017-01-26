import javax.swing.JOptionPane;
public class TaskSix
{
  public static void main(String [] args)
  {
    int time = 615;
    int hours = time/60;
    int minutes = time%60;

    JOptionPane.showMessageDialog(null,"Time worked: "+time+"\nHours:"+hours+" Minutes:"+minutes );
  }
}
