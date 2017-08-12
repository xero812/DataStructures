package linkedlists;

public class DLLNode
{
    int data;
    DLLNode next;
    DLLNode prev;
    public DLLNode(int data)
    {
        this.data=data;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public DLLNode getNext()
    {
        return next;
    }

    public void setNext(DLLNode next)
    {
        this.next = next;
    }

    public DLLNode getPrev()
    {
        return prev;
    }

    public void setPrev(DLLNode prev)
    {
        this.prev = prev;
    }
    
    
}
