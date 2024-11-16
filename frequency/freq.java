
import java.util.Scanner;

class freq 
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter string ");
        String str = sn.nextLine();
        System.out.println("Enter the char to be searched : ");
        char ch = sn.nextLine().charAt(0);
        int c = 0 ;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == ch)
            {
                c = c + 1 ;
            }
        }
        if(c == 0)
        {
            System.out.println("Not Found ! ");
        }
        else
        {
            System.out.print("Found " + c + " Times");
        }
    }
}