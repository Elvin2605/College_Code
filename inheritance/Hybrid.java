import studpack.Result ;
public class Hybrid {
    public static void main(String[] args) {
        Result[] students = {
            new Result("Elvin", 28, 100, 50),
            new Result("Ben", 23, 100, 25),
            new Result("KP", 39, 100, 49),
            new Result("Joshua", 37, 100, 48),
            new Result("Namish", 43, 100, 1),
        };
    
        for(Result student : students)
        {
            student.display(); 
            System.out.println("------------");
        }
    }
    
}
