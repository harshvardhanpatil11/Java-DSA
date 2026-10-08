import java.util.*;
public class stackByQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    //Empty Function
    public static boolean isEmpty()
    {
        return q1.isEmpty() && q2.isEmpty();
    }

    //add function
    public static void push(int data)
    {
        if(!q1.isEmpty())
        {
            q1.add(data);
        }else{
            q2.add(data);
        }
    }

    //remove function
    public static int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty...");
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                top = q1.remove();
                if(q1.isEmpty())
                {
                    break;
                }
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty())
            {
                top = q2.remove();
                if(q2.isEmpty())
                {
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    public static int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty...");
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                top = q1.remove();
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty())
            {
                top = q2.remove();
                q1.add(top);
            }
        }
        return top;
    }
    public static void main(String str[])
    {
        stackByQueue s = new stackByQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Top of Stack : "+s.peek());

        System.out.println("Removed Element of Stack : "+s.pop());

        System.out.println("Top of Stack : "+s.peek());


    }
    
}
