package linkedlists;

public class QueuesWithLinkedLists
{
    
    private int length;
    ListNode front,rear;
    
    public QueuesWithLinkedLists()
    {
        length=0;
        front=rear=null;
    }
    
    public void enQueue(int data)
    {
        ListNode node=new ListNode(data);
        if(isEmpty())
        {
            front=node;
        }
        else
        {
            rear.setNext(node);
        }
        rear=node;
        length++;
    }
    
    public int deQueue() throws CloneNotSupportedException
    {
        if(isEmpty())
        {
            
        }
        int result=front.getData();
        front=front.getNext();
        length--;
        if(isEmpty())
        {
            rear=null;
        }
        return result;
    }
    
    private boolean isEmpty()
    {
        return length==0;
    }
    
    public void display() throws CloneNotSupportedException
    {
        ListNode temp=front;
        while(temp!=null)
        {
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        QueuesWithLinkedLists o=new QueuesWithLinkedLists();
        o.enQueue(1);
        o.enQueue(2);
        o.enQueue(3);
        o.enQueue(4);
        o.deQueue();
        o.display();
    }
    
}
