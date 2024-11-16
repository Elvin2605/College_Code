

import java.util.* ;
class S 
{
    stacks st = new stacks();
    public void push(int data)
    {
        if(st.top == st.arr.length - 1 )
        {
            System.out.println("Overflow ! ");
        }
        else{
            st.top = st.top + 1 ;
            st.arr[st.top] = data ;
        }
    }
    public void pop()
    {
        if(st.top == -1)
        {
            System.out.println("Underflow !");
        }
        else
        {
            st.top -- ;
        }
    }
    public void peek()
    {
        if(st.top == -1)
        {
            System.out.println("Stack Empty !");
        }else
        {
            System.out.println("top element is " + st.arr[st.top]) ;
        }
    }
    public void display()
    {
        int i ;
        if(st.top == -1 )
        {
            System.out.println("The Stack is Empty  ! ");
        }
        else
        {
            for(i = st.top ; i >= 0 ; i--)
            {
                System.out.println(" " + st.arr[i]);
            }
        }
    }
}

public class stacks {
    int arr[] = new int[5] ;
    int top = -1 ;
    public static void main(String[] args) {
        int ch ;
        
        S obj = new S();
        Scanner sn = new Scanner(System.in) ;
        ch = sn.nextInt();
        do
        {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice : ");
            ch = sn.nextInt();
            switch(ch)
            {
                case 1 :
                    System.out.println("Enter the element : ");
                    int temp = sn.nextInt();
                    obj.push(temp);
                    break ;
                case 2 :
                    obj.pop();
                    break ;
                case 3 :
                    obj.peek();
                    break ;
                case 4 : 
                    obj.display();
                    break ;
                case 5 :
                    break ;


            }
        }while(ch != 5);
        
    }
}
