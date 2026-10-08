public class QueueUsingArray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        //Queue Construtor for initialize vairables
        Queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
        }
        //Check Queue is Empty or Not
        public static boolean isEmpty()
        {
            return rear == -1;
        }
        //Add Data in Queue
        public static void enqueue(int data)
        {
            if(rear == size-1)
            {
                System.out.println("Queue is Full...");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        //Remove data from Queue
        public static int dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty...");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++)
            {
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        //Retrun First Element of Queue
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty...");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String arg[])
    {
        Queue q = new Queue(5);
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
