import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class file2 {
    public static void main(String[] args) {
        try
        {
            Scanner sn = new Scanner(System.in);
            File f = new File("f2.txt");
            f.createNewFile() ;
            FileReader r = new FileReader("f2.txt");
            BufferedReader br = new BufferedReader(r);
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")) ;
            String[] arr = new String[100] ;
            String data ;
            int i = 0 ;
            while((data = br.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(data , " ");
                while(st.hasMoreTokens())
                {
                    String temp = st.nextToken() ;
                    arr[i] = temp ;
                    i++ ;
                }
            }
            
            for(int k = 0 ; (arr[k] != null) ; k++)
            {
                System.out.print(" " + arr[k] +) ;
            }
            System.out.println("Enter the word to be searched : ");
            String key = sn.nextLine() ;
            int count = 0 ;
            for(int j = 0 ; j < arr.length ; j++)
            {
                if ((arr[j].compareTo(key)) == 0) 
                {
                    //bw.write(arr[j]) ;
                    System.out.println("Found at the position " + j+1) ;
                    count = 1 ;
                }
            }
            if (count != 1)
            {
                System.out.println(key + " Not Found ");
            }
            bw.close();
            br.close();
            r.close();
        }
        catch(Exception e)
        {
            System.out.println("Error boi ! ");
        }
    }
}
