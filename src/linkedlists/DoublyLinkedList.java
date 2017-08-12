package linkedlists;

public class DoublyLinkedList
{
    
    DLLNode head;
    DLLNode tail;
    
    public static void main(String[] args) 
    {
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.inputNodes();
        obj.delete(1);
        obj.displayNodes();   
    }

    private void insertAtStart(DLLNode dllNode)
    {
        if(head==null)
        {
            head=tail=dllNode;
        }
        dllNode.setNext(head);
        head.setPrev(dllNode);
        head=dllNode;
    }

    private void inputNodes()
    {
        DLLNode n1=new DLLNode(1);
        DLLNode n2=new DLLNode(2);
        DLLNode n3=new DLLNode(3);
        DLLNode n4=new DLLNode(4);
        DLLNode n5=new DLLNode(5);
        
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        
        n5.setPrev(n4);
        n4.setPrev(n3);
        n3.setPrev(n2);
        n2.setPrev(n1);
        
        head=n1;
        tail=n5;
    }

    private int countNodes()
    {
        int c=0;
        DLLNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.getNext();
        }
        return c;
    }

    private void displayNodes()
    {
        DLLNode temp=head;
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    private void insertAtEnd(DLLNode dllNode)
    {
        if(tail==null)
        {
            head=tail=dllNode;
            return;
        }
        tail.setNext(dllNode);
        dllNode.setPrev(tail);
    }

    private void insert(DLLNode dllNode, int i)
    {
        if(i>=countNodes()-1)
        {insertAtEnd(dllNode);return;}
        else if(i<=0)
        {insertAtStart(dllNode);return;}
        DLLNode temp=head;
        for (int j = 1; j < i; j++)
        {
            temp=temp.getNext();
        }
        DLLNode n1=temp,n2=temp.getNext();
        n1.setNext(dllNode);
        n2.setPrev(dllNode);
        dllNode.setNext(n2);
        dllNode.setPrev(n1);
    }

    private DLLNode deleteFromStart()
    {
        if(head==null)
        {
            return null;
        }
        else if(head==tail)
        {
            DLLNode tmep=head;
            head=tail=null;
            return tmep;
        }
        DLLNode node=head;
        head=head.getNext();
        head.setPrev(null);
        return node;
    }

    private DLLNode deleteFromEnd()
    {
        if(head==null)
        {
            return null;
        }
        else if(head==tail)
        {
            DLLNode node=head;
            head=tail=null;
            return node;
        }
        else
        {
            DLLNode node=tail.getPrev();
            node.setNext(null);
            return node;
        }
    }

    private DLLNode delete(int i)
    {
        if(i<=0)
            return deleteFromStart();
        else if(i>=countNodes()-1)
            return deleteFromEnd();
        else
        {
            DLLNode n1=head;
            for (int j = 1; j < i; j++)
            {
                n1=n1.getNext();
            }
            DLLNode temp=n1.getNext();
            DLLNode n2=n1.getNext().getNext();
            n1.setNext(n2);
            n2.setPrev(n1);
            return temp;
        }
            
    }
    
   
    
    
}
