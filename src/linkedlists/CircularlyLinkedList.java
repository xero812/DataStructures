package linkedlists;

public class CircularlyLinkedList
{
    CLLNode head;
    
    public static void main(String[] args) 
    {
        CircularlyLinkedList obj=new CircularlyLinkedList();
        obj.inputNodes();
        obj.deleteFromEnd();
        System.out.println(obj.countNodes());
        obj.displayNodes();
        
    }

    private int countNodes()
    {
        int c=1;
        if(head==null)
            return 0;
        CLLNode node=head.getNext();
        while(node!=head)
        {
            c++;
            node=node.getNext();
            
        }
        return c;
    }

    private void inputNodes()
    {
        CLLNode n1=new CLLNode(1);
        CLLNode n2=new CLLNode(2);
        CLLNode n3=new CLLNode(3);
        CLLNode n4=new CLLNode(4);
        CLLNode n5=new CLLNode(5);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n1);
        head=n1;
    }

    private void displayNodes()
    {
        CLLNode node=head.getNext();
        System.out.println(head.getData());
        while(node!=head)
        {
            System.out.println(node.getData());
            node=node.getNext();
        }
    }

    private void insertAtEnd(CLLNode node)
    {
        if(head==null)
        {
            head=node;
            head.setNext(node);
            return;
        }
        CLLNode temp=head.getNext();
        while(temp!=head)
        {
            if(temp.getNext().equals(head))
                break;
            temp=temp.getNext();
        }
        temp.setNext(node);
        node.setNext(head);
    }

    private void insertAtStart(CLLNode node)
    {
        if(head==null)
        {
            head=node;
            head.setNext(node);
            return;
        }
        CLLNode temp=head.getNext();
        while(temp!=head)
        {
            if(temp.getNext().equals(head))
                break;
            temp=temp.getNext();
        }
        temp.setNext(node);
        node.setNext(head);
        head=node;
            
    }

    private CLLNode deleteFromStart()
    {
        if(head==null)
        {
            return null;
        }
        CLLNode temp=head.getNext();
        while(temp!=head)
        {
            if(temp.getNext().equals(head))
                break;
            temp=temp.getNext();
        }
        temp.setNext(head.getNext());
        CLLNode result=head;
        head=head.getNext();
        return result;
    }

    private CLLNode deleteFromEnd()
    {
        if(head==null)
        {
            return null;
        }
        CLLNode temp=head.getNext();
        while(temp!=head)
        {
            if(temp.getNext().equals(head))
                break;
            temp=temp.getNext();
        }
        CLLNode temp1=temp.getNext();
        while(temp1!=temp)
        {
            if(temp1.getNext().equals(temp))
                break;
            temp1=temp1.getNext();
        }
        temp1.setNext(head);
        return temp;
    }
    
    
    
}
