import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    JFrame frame1 = new JFrame("Emotional Cow");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(500,500);
    ArrayList<String> names = new ArrayList<>();
    names.add("Buster");
    names.add("Daisy");
    names.add("Sugar");
    names.add("Cocoa");
    names.add("Julie");

//-----------------------Panel1------------------------
    JPanel panel1 = new JPanel(new GridLayout(3,2,20,20));

//----------------------Panel2--------------------------
    JPanel panel2 = new JPanel(new GridLayout(1,1,20,20));

//----------------------Panel3---------------------------
    JPanel panel3 = new JPanel(new BorderLayout(10,10));

//----------------------Label1----------------------------
    JLabel label1 = new JLabel("Current Name: Julie");
    JTextField textfield1 = new JTextField(10);

//---------------------Label2------------------------------
    JLabel label2 = new JLabel("Current Emotion: Happy");
    JTextField textfield2 = new JTextField(10);

//---------------------Button1-----------------------------
    JButton button1 = new JButton("Add Name:");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String tempName = textfield1.getText();
        names.add(tempName);
        label1.setText("Current Name: " + tempName);
        textfield1.setText("");
      }//end block for function of Button1
    });//end the ActionListener for Button1

//-------------------------Button2------------------------
    JButton button2 = new JButton("New Emotion:");

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String tempEmotion = textfield2.getText();
        label2.setText("Current Emotion: " + tempEmotion);
        textfield2.setText("");
      }//end block for function of Button2
    });//end the ActionListener for Button2

//-----------------------Button3----------------------------
    JButton button3 = new JButton("Random Name");

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
    panel1.add(textfield1);
    panel1.add(textfield2);
    panel1.add(button3);
    panel2.add(label1);
    panel2.add(label2);
    panel3.add(cowLabelPic);
    
    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.CENTER, panel2);
    frame1.getContentPane().add(BorderLayout.SOUTH, panel3);

    frame1.setVisible(true);
  }//end main method
}//end class Main