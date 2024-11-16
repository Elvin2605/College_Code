package studpack;

public class Student {
    protected String name ;
    protected int rollno ;
    protected int amarks ;

    public Student(String name , int rollno , int amarks)
    {
        this.name = name ;
        this.rollno = rollno ;
        this.amarks = amarks ;
    }
    public String getname()
    {
        return name ;
    }
    public int getrollno()
    {
        return rollno ;
    }
    public int getamarks()
    {
        return amarks ;
    }
}
