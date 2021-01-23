import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main
{
  public static void main(String args[])
  {
    JFrame frame1 = new JFrame("hello there");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(500,500);
    
    JPanel panel1 = new JPanel(new GridLayout(2,2,20,20));


    JLabel label1 = new JLabel("Hello There");
    JTextField textfield1 = new JTextField(10);


//---------------------Button1-------------------------------
    JButton button1 = new JButton("This is button1");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("hello there buddy");
      }//end block for function of Button1
    });//end the ActionListener for Button1

//---------------------------Button2------------------------
    JButton button2 = new JButton("This is button1");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("hello there buddy2");
      }//end block for function of Button2
    });//end the ActionListener for Button2

//-----------------------Button3----------------------------





    panel1.add(button1);
    panel1.add(button2);
    frame1.getContentPane().add(panel1);
    frame1.setVisible(true);
  }//end main method
}//end class Main