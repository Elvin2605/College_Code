/*class T1 implements Runnable 
{
    public void run()
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
}
class T2 implements Runnable
{
    public void run()
    {
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("2nd thread " + i);
        }
        try
        {
            Thread.sleep(20);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Excpetion occured while sleeping ");
        }
        
    }
}

class multit
{
    public static void main(String args[])
    {
        T1 o1 = new T1() ;
        T2 o2 = new T2() ;
        
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        
        t1.start();
        t2.start();
    }
}
    */

    import java.util.Stack;

    class SharedStack {
        private Stack<Integer> stack = new Stack<>();
        private final int MAX_SIZE = 5;
    
        // Push operation with synchronization
        public synchronized void push(int data) {
            while (stack.size() == MAX_SIZE) {
                try {
                    System.out.println("Stack is full, waiting to push...");
                    wait(); // Wait if the stack is full
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            stack.push(data);
            System.out.println("Pushed: " + data);
            notifyAll(); // Notify other threads waiting to pop
        }
    
        // Pop operation with synchronization
        public synchronized void pop() {
            while (stack.isEmpty()) {
                try {
                    System.out.println("Stack is empty, waiting to pop...");
                    wait(); // Wait if the stack is empty
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int data = stack.pop();
            System.out.println("Popped: " + data);
            notifyAll(); // Notify other threads waiting to push
        }
    }
    
    // Thread for pushing elements onto the stack
    class PusherThread extends Thread {
        private SharedStack sharedStack;
    
        public PusherThread(SharedStack sharedStack) {
            this.sharedStack = sharedStack;
        }
    
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) { // Push 10 elements
                sharedStack.push(i);
                try {
                    Thread.sleep(500); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    // Thread for popping elements from the stack
    class PopperThread extends Thread {
        private SharedStack sharedStack;
    
        public PopperThread(SharedStack sharedStack) {
            this.sharedStack = sharedStack;
        }
    
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) { // Pop 10 elements
                sharedStack.pop();
                try {
                    Thread.sleep(700); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public class StackThreadExample {
        public static void main(String[] args) {
            SharedStack sharedStack = new SharedStack();
    
            PusherThread pusher = new PusherThread(sharedStack);
            PopperThread popper = new PopperThread(sharedStack);
    
            pusher.start(); // Start pusher thread
            popper.start(); // Start popper thread
    
            try {
                pusher.join();
                popper.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
            System.out.println("All operations are complete.");
        }
    }
    