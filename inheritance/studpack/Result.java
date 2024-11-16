package studpack;

public class Result extends Student implements Sports {
    private int smarks ;
    public Result(String name , int roll , int amarks , int smarks)
    {
        super(name, roll, amarks);

        this.smarks = smarks ;
    }

    public int getsmarks()
    {
        return smarks ;
    }
    public int gettmarks()
    {
        return  (amarks + smarks) ;
    }
    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Name : " + rollno);
        System.out.println("Name : " + amarks);
        System.out.println("Name : " + getsmarks());
        System.out.println("Name : " + gettmarks());
    }
}
