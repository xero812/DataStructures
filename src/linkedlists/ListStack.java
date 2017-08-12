package linkedlists;


import java.util.EmptyStackException;

public class ListStack
{
    
    private int length;
    private ListNode top;
    
    public ListStack()
    {
        length=0;
        top=null;
    }
    
    public void push(int data)
    {
        ListNode temp=new ListNode(data);
        temp.setNext(top);
        top=temp;
        length++;
    }
    
    public int pop() throws CloneNotSupportedException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int result=top.getData();
        top=top.getNext();
        length--;
        return result;
    }
    
    public int peek() throws CloneNotSupportedException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    private boolean isEmpty()
    {
        return (length==0);
    }
    
    public void display() throws CloneNotSupportedException
    {
        ListNode current=top;
        while(current!=null)
        {
            System.out.print(current.getData()+" ");
            current=current.getNext();
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ListStack stack=new ListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.display();
        
        
    }
    
}
