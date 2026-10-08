public class queueUsingLinkedLIst {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue{
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty()
        {
            return head == null && tail == null;
        }
        public static void enqueue(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty...");
                return -1;
            }
            int front = head.data;
            head = head.next;
            return front;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty...");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String arg[])
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Front of Queue :" +q.peek());
        System.out.println("Deleted Element :"+q.dequeue());
        System.out.println("Front of Queue :" +q.peek());
    }
    
}
