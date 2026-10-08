import java.util.*;
public class reversalQueue 
{
    public static void reversal(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty())
        {
            s.push(q.remove());
        }

        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
    }
    public static void main(String arg[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        System.out.println("Queue Befor Reversal : "+q);

        reversal(q);

        System.out.println("Queue After Reversal : "+q);
    }
}
