import java.util.*;
public class queueByDeque 
{
    Deque<Integer> d =  new ArrayDeque<>();
    public void add(int data)
    {
        d.addLast(data);
    }
    public void remove()
    {
        d.removeFirst();
    }
    public void front()
    {
        System.out.println("Front Element of Queue :"+d.peek());
    }
    public void print()
    {
        System.out.println(d+"");
    }
    public static void main(String arg[])
    {
        queueByDeque q = new queueByDeque();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.print();

        q.remove();
        q.print();
        q.front();
    }
    
}
