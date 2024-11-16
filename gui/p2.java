import  java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
class Addition extends JFrame implements ActionListener
{
    JTextField t1,t2 ;
    JButton b ;
    JLabel l ;
    public Addition()
    {
        //4lines always used
        setVisible(true) ;
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        b = new JButton("=");
        l = new JLabel("Result : ");
        add(t1);
        add(t2);
        add(b);
        add(l);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(t1.getText()) ;
        int num2 = Integer.parseInt(t2.getText()) ;
        int result = num1 + num2 ;
        l.setText(result + "");
    }
}

public class p2 {
    public static void main(String args[])
    {    
        Addition obj = new Addition() ;
    }
}
