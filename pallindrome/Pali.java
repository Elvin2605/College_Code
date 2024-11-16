import java.util.* ;
class pali 
{
    public static void main(String args[])
    {
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter string : ");
            String str = sn.nextLine();
            String rev = "" ;
            char ch ;
            int len = str.length() ;
            for(int i = len - 1 ; i >= 0 ; i--)
            {
                ch=str.charAt(i);
                rev = rev + ch ;
            }
            if (str.equals(rev))
            {
                System.out.println(rev +" is palindrome");
            }
            else{
                System.out.println("NO");
            }
    }
}
