//Write an application that displays a JFrame containing the opening sentence from A Christmas Carol. Add a button to the frame in the JBookQuote program. When the user clicks the button, display the title of the book that contains the quote in the available JLabel using the setText() method.


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote extends JFrame {
   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("To begin with,");
   JLabel msg2 = new JLabel("Marley was dead.");
   JButton button = new JButton("Click for source");
   JLabel msg3 = new JLabel();
   String title = "**    A Christmas Carol    **";
    public JBookQuote() {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(msg2);
    }
    public static void main(String[] args) {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(300, 150);
        aFrame.setVisible(true);
    }
}
