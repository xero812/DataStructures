package linkedlists;

public class ListNode implements Cloneable
{
    
    private int data;
    private ListNode next ;
    
    public ListNode(int data)
    {
        this.data=data;
    }
    
    public int getData() throws CloneNotSupportedException
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public ListNode getNext()
    {
        return next;
    }

    public void setNext(ListNode next)
    {
        this.next = next;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    
    
}
