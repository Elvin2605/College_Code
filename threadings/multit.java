class T1 implements Runnable 
{
    public void run()
    {
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("1st thread " + i);
        } 
        try
        {
            Thread.sleep(10);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Excpetion occured while sleeping ");
        }
        

    }
}
class T2 implements Runnable
{
    public void run()
    {
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("2nd thread " + i);
        }
        try
        {
            Thread.sleep(20);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Excpetion occured while sleeping ");
        }
        
    }
}
class T3 implements Runnable
{
    public void run()
    {
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("3rd thread " + i);
        }
        try
        {
            Thread.sleep(10);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Excpetion occured while sleeping ");
        }
    }
}
class multit
{
    public static void main(String args[])
    {
        T1 o1 = new T1() ;
        T2 o2 = new T2() ;
        T3 o3 = new T3() ;
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);
        t1.start();
        t2.start();
        t3.start();
    }
}