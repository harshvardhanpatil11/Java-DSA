import java.util.*;

public class deque 
{
    public static void main(String arg[])
    {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(10);
        d.offer(20);
        d.add(30);
        d.offer(40);
        d.add(50);
        d.offer(60);
        System.out.println("Deque : "+d);

        //remove Operations
        d.removeFirst();
        System.out.println("Deque : "+d);
        d.removeLast();
        System.out.println("Deque : "+d);
        System.out.println("Peek First : "+d.peekFirst());
        System.out.println("Peek Last : "+d.peekLast());
    }    
}
