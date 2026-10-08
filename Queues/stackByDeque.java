import java.util.*;
public class stackByDeque 
{
    public static Deque<Integer> d = new ArrayDeque<>();
    public void push(int data)
    {
        d.addLast(data);
    }
    public void pop()
    {
        d.removeLast();
    }
    public void top()
    {
        System.out.println("Top  of Stack :"+ d.getLast());
    }
    public void printStack()
    {
       System.out.println(d);
    }
    public static void main(String arg[])
    {
        stackByDeque s = new stackByDeque();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.printStack();

        s.pop();
        s.top();

        s.pop();
        s.printStack();

    }
}
