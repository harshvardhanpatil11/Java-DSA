import java.util.*;
public class QueueBYStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    
    
    public static boolean isEmpty()
    {
        return s1.isEmpty();
    }
    
    //Push in Queue
    public static void enqueue(int data)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }

    //REMOVE FUNCTION
    public static int dqueue()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is Empty ...");
            return -1;
        }
        return s1.pop();
    }

    //RETURN FRONT OF QUEUE
    public static int front()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is Empty ....");
            return -1;
        }
        return s1.peek();
    }
    public static void main(String arg[])
    {
        QueueBYStack q = new QueueBYStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Front of Queue : "+q.front());
        System.out.println("Remove Element :" +q.dqueue());
        System.out.println("Front of Queue : "+q.front());


    }    
}
