import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class cal extends JFrame implements ActionListener
{
    JTextField t1 , t2 ;
    JLabel l1 ;
    JButton b1, b2 ;
    public cal()
    {
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout()) ; 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        add(t1);
        add(t2);
        b1 = new JButton("+");
        b2 = new JButton("-");
        add(b1);
        add(b2);
        JLabel l = new JLabel("Result is ");
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public ActionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(t1.getText());        
        int num2 = Integer.parseInt(t2.getText());       
        int value =  
    }
    
}
public class p3 {
    public static void main(String[] args) {
        cal c = new cal();
    }    
}
