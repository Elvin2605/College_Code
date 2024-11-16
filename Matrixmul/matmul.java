import java.util.*;

class matmul
{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the rows and cols of the 1st matrix ");
        int r1 = sn.nextInt() ;
        int c1 = sn.nextInt() ;
        System.out.println("Enter the rows and cols of the 2nd matrix ");
        int r2 = sn.nextInt() ;
        int c2 = sn.nextInt() ;

        if (c1 != r2)
        {
            System.out.println("Matrix multiplication is not possible ! ");
            return;
        }
        int A[][] = new int[r1][c1]  ;
        int B[][] = new int[r2][c2] ;
        int C[][] = new int[r1][c2] ;
        System.out.println("Enter the 1st matrix ...");
        for(int i = 0 ; i < r1 ; i++)
        {
            for(int j = 0 ; j < c1 ; j++)
            {
                A[i][j] = sn.nextInt() ;
            }
        }
        System.out.println("Enter the 2nd matrix ...");
        for(int i = 0 ; i < r2 ; i++)
        {
            for(int j = 0 ; j < c2 ; j++)
            {
                B[i][j] = sn.nextInt() ;
            }
        }
        for(int i = 0 ; i < r1 ; i++)
        {
            for(int j = 0 ; j < c2 ; j++)
            {
                C[i][j] = 0 ;
                for(int k = 0 ; k < c1 ; k++)
                {
                    C[i][j] +=  A[i][k] * B[k][j] ;
                }
                
            }
        }
        for(int i = 0 ; i < r1 ; i++)
        {
            for(int j = 0 ; j < c2 ; j++)
            {
                System.out.print(" " + C[i][j]);
            }
            System.out.println("");
        }
    }
}