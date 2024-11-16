import java.util.Scanner;
class Qsort 
{
    private static int partition(int[] arr,int lb,int ub)
    {
        int pi = arr[ub];
        int i = lb - 1 ;
        for(int j = lb ; j < ub ; j++)
        {
            if(arr[j] < pi)
            {
                i++ ;
                int temp = arr[j] ;
                arr[j] = arr[i] ;
                arr[i] = temp ;
            }
        }
        int temp = arr[i+1] ;
        arr[i+1] = arr[ub] ;
        arr[ub] = temp ;
        return i+1 ;
    }
    public void Quicksort(int[] arr,int lb,int ub)
    {
        if(lb < ub )
        {
            int pi = partition(arr, lb, ub) ;
            Quicksort(arr,lb,pi-1);
            Quicksort(arr,pi+1,ub);
        }    
    }
}
class binse 
{
    public static void main(String args[]) {
        Qsort q = new Qsort();
        int l,lb,ub,m,r ;
        Scanner sn = new Scanner(System.in) ;

        System.out.println("Enter the number of elements in the array : ");
        int length = sn.nextInt();
        int arr[] = new int[length] ;
        for(int i = 0 ; i < length ;i++)
        {
            arr[i] = sn.nextInt() ;
        }
        System.out.println("unsorted array ...");
        for(int i = 0 ; i < length ;i++)
        {
            System.out.println(arr[i]);
        }
        
        lb = 0 ;
        ub = length - 1 ;
        l = 0 ;
        r = length ;
        q.Quicksort(arr, lb, ub);
        System.out.println("sorted array ...");
        for(int i = 0 ; i < length ;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the search element : ");
        int key = sn.nextInt() ;
        //binary search
        l = 0 ;
        r = length - 1 ;
        while(l < r)
        {
            m = (l + r )/2 ;
            if(arr[m] == key)
            {
                System.out.println("Found at index " + m);
                return;
            }
            else if(arr[m] < key)
            {
                l = m + 1 ;
            }
            else 
            {
                r = m - 1 ;
            }
        }

    }
}