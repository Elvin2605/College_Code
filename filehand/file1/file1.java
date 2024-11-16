
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

/*
 * 
 * 
//package filehand.file1 ;

import java.lang.reflect.Method;

class file1 
{
    public static void main(String[] args) {
        Class<?> cl = String.class;
        Method[] M = cl.getMethods();
        for(Method m1 : M){
            System.out.println(m1);
        }
    }
}
 */

class file1 
{
    
    public static void main(String[] args) {
        try
        {
            FileReader r = new FileReader("f1.txt") ;
            BufferedReader br = new BufferedReader(r);
            BufferedWriter bw = new BufferedWriter(new FileWriter("output1.txt")) ;
            int ch ;
            String data ;
            while ((data = br.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(data , " ");
                while(st.hasMoreTokens())
                {
                    String temp = st.nextToken();
                    int length = temp.length() ;
                    String item = Integer.toString(length) ;
                    bw.write(item);
                    bw.write("\t");
                }
                bw.write("\n");
            }
            r.close();
            br.close();
            bw.close();

        }
        catch(Exception e)
        {
            System.out.println("error boi ! ");
        }    
    }
}
