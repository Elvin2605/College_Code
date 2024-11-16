
import java.util.Scanner;

class scn 
{
    synchronized void display(char c)
    {
        System.out.print(c);
    }
}
class T1 extends Thread 
{
    Scanner sn = new Scanner(System.in) ;
    char ch = sn.nextLine().charAt(0);
    scn s = new scn();
    @Override
    public void run()
    {
        s.display(ch);
    }
}
class T2 extends Thread 
{
    Scanner sn = new Scanner(System.in) ;
    char ch2 = sn.nextLine().charAt(0);
    scn s = new scn();
    @Override
    public void run()
    {
        s.display(ch2);
    }
}
class sycho 
{
    public static void main(String[] args) {
        T1 o1 = new T1() ;
        T2 o2 = new T2() ;
        o1.start();
        o2.start();
    }
}