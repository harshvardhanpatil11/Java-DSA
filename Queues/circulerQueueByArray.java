public class circulerQueueByArray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n)
        {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }
        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }
        public static boolean isFull()
        {
            return (rear + 1)%size == front;
        }
        public static void enqueue(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is Full...");
                return;
            }
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty...");
                return -1;
            }
            int result = arr[front];
            if(rear == front)
            {
                rear = front = -1;
            }
            front = (front + 1) % size;
            return result;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty...");
                return -1;
            }
            return arr[front];
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
        q.enqueue(60);
        System.out.println("Front of Queue :" +q.peek());
        System.out.println("Deleted Element :"+q.dequeue());
        q.enqueue(60);
        System.out.println("Front of Queue :" +q.peek());
    }
    
}
