package linkedlists;

public class FixedQueue
{
    private int[] queue;
    private int size,front,rear;
    private static final int CAPACITY=8;  
    
    public FixedQueue()
    {
        queue=new int[CAPACITY];
        size=0;
        front=0;
        rear=0;
    }
    
    public void enQueue(int data) throws Exception
    {
        if(size==CAPACITY)
            throw new Exception("Queue is full : Overflow");
        else
        {
            size++;
            queue[rear]=data;
            rear=(rear+1)%CAPACITY;
        }   
     }

    public int deQueue() throws Exception
    {
        if(size==0)
            throw new Exception("Queue is full : Underflow");
        else
        {
            size--;
            int data=queue[front%CAPACITY];
            queue[front]=Integer.MIN_VALUE;
            front=(front+1)%CAPACITY;
            return data;
        }
    }
    
    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(queue[(front+i)%CAPACITY]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws Exception 
    {
        FixedQueue queue1=new FixedQueue();
        queue1.enQueue(1);
        queue1.enQueue(2);
        queue1.deQueue();
        queue1.deQueue();
        queue1.enQueue(1);
        queue1.enQueue(2);
        queue1.enQueue(3);
        queue1.enQueue(4);
        queue1.enQueue(5);
        queue1.enQueue(6);
        queue1.enQueue(7);
        queue1.enQueue(8);
        System.out.println(queue1.front+" "+queue1.rear);
        queue1.display();
    }

}

