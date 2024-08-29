import java.util.* ;
class greatest 
{
    public static void main (String args[])
    {
        Scanner sn = new Scanner(System.in);
        int num1 = sn.nextInt();
        int num2 = sn.nextInt();
        int num3 = sn.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest ! ");
        }
        else if (num2 > num3 && num2 > num1) {
            System.out.println(num2 + " is greatest ! ");
        }
        else {
            System.out.println(num3 + " is greatest ! ");
        }

    }
}