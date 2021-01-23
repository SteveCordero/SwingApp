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
//-----------------------Panel1------------------------
    JPanel panel1 = new JPanel(new GridLayout(1,3,20,20));

//----------------------Panel2--------------------------
    JPanel panel2 = new JPanel(new BorderLayout(10,10));

//----------------------Label1------------------------------
    JLabel label1 = new JLabel("Hello There");
    JTextField textfield1 = new JTextField(10);

//---------------------Label2--------------------------------
    JLabel label2 = new JLabel("heheh");
    
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

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("hello there buddy2");
      }//end block for function of Button2
    });//end the ActionListener for Button2

//-----------------------Button3----------------------------
    JButton button3 = new JButton("This is button3");

    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("hello there buddy3");
      }//end block for function of Button3
    });//end the ActionListener for Button3

//------------------------Image1- CuteCow ----------------------
    ImageIcon cow = new ImageIcon("cutecow.jpg", "amazing cutie cow");
    JLabel cowLabelPic = new JLabel(cow);

    panel1.add(button1);
    panel1.add(button2);
    panel1.add(button3);
    panel2.add(label2);
    panel2.add(cowLabelPic);
    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.CENTER, panel2);

    frame1.setVisible(true);
  }//end main method
}//end class Main