import java.util.*;
public class queueUsingJCF 
{

    public static void main(String arg[])
    {
        Queue<Integer> q = new LinkedList<>();  

        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(40);
        q.offer(50);
        System.out.println("Queue : "+q);
        System.out.println("................................................................");
        System.out.println("Remove Element :"+q.remove());
        System.out.println("................................................................");
        System.out.println("Queue :"+q);
        System.out.println("................................................................");
        System.out.println("Remove Element :"+q.poll());
        System.out.println("................................................................");
        System.out.println("Queue:"+q);
        System.out.println("................................................................");
        System.out.println("Front Element :"+q.peek());
        System.out.println("................................................................");
        System.out.println("Queue Size :"+q.size());
        System.out.println("................................................................");
        System.out.println("Remove Element :"+q.remove());
        System.out.println("................................................................");
        System.out.println("Front Element :"+q.element());
        System.out.println("................................................................");
        System.out.println("Remove Element :"+q.remove());
        System.out.println("................................................................");
        System.out.println("Remove Element :"+q.remove());
        System.out.println("................................................................");
        if(q.isEmpty())
        {
            System.out.println("Queue is Empty....");
        }else{
            System.out.println("Queue is not Empty....");
        }
        System.out.println("................................................................");
    }
}
