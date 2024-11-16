import java.awt.FlowLayout;
import javax.swing.*;
class abc extends JFrame
{
    public abc()
    {
        setVisible(true) ;
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 = new JLabel("Hello World ! ");
        JLabel l2 = new JLabel("Welcome naveen ! ");
        add(l1) ;
        add(l2);
        
        
    }
}
class P1
{
    public static void main(String args[])
    {
        abc obj = new abc() ;
        
    }
    

}

