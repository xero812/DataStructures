package linkedlists;

/**
 *
 * @author Adesh Srivastava
 */

public class LinkedListOperations implements Cloneable
{
    
    //Print the Elements of a Linked List 
    private void displayNodes(ListNode temp) throws CloneNotSupportedException
    {
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
    
    private void insertAtStart(ListNode node)
    {
        node.setNext(head);
        head=node;
    }
    
    //Insert a Node at the Tail of a Linked List 
    private void insertAtEnd(ListNode endNode)
    {
        if(head==null)
            head=endNode;
        else
        {
            ListNode temp=head;
            while(temp.getNext()!=null)
                temp=temp.getNext();
            temp.setNext(endNode);
        }
    }

    private void insertAtMiddle(int data, int position)
    {
        ListNode temp=head;
        if(position<=0)
        {    
            insertAtStart(new ListNode(data));
        }
        else if(position>=countNodes())
        {
            insertAtEnd(new ListNode(data));
        }
        else
        {
            for (int i = 1; i < position; i++)
            {
                temp=temp.getNext();
            }
            ListNode newNode=new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }    
    }

    private ListNode removeFromBegin()
    {
        ListNode node=head;
        if(node!=null)
        {
            head=node.getNext();
            node.setNext(null);
        }
        return node;
    }

    private ListNode removeFromEnd()
    {
        if(head==null)
            return null;
        else if(head.getNext()==null)
        {
            ListNode node=head;
            head=null;
            return node;
        }
        else
        {
            ListNode temp=head,secondLast=null;
            while(temp.getNext()!=null)
            {
                secondLast=temp;
                temp=temp.getNext();
            }
            secondLast.setNext(null);
            return temp;
        }
    }

    private void removeMatched(ListNode node) throws CloneNotSupportedException
    {
        if(head==null)
        {
            return;
        }
        if(head.getData()==node.getData())
        {
            head=head.getNext();
            return;
        }
        ListNode temp=head,q=null;
        while(temp.getNext()!=null)
        {
            q=temp;
            temp=temp.getNext();
            if(node.getData()==temp.getData())
            {
                q.setNext(temp.getNext());
            }
        }
    }

    private void remove(int i)
    {
        ListNode temp=head;
        if(i<0)
            i=0;
        else if(i>countNodes())
            i=countNodes()-1;
        if(head==null)
        {
            return;
        }
        if(i==0)
            head=head.getNext();
        else
        {
            for (int j = 1; j < i; j++)
            {
                temp=temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
    }
    
    
    
    
    ListNode head;
    ListNode rev;
    public static void main(String[] args) throws CloneNotSupportedException
    {
        LinkedListOperations o=new LinkedListOperations();
        o.inputValues();
        o.rev=o.rev(o.head,o.rev);
        o.displayNodes(o.rev);
        //o.displayNodes(o.head);
    }

    private void inputValues()
    {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        head=n1;
    }

    private int countNodes()
    {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            //System.out.println(temp.getData());
            c++;
            temp=temp.getNext();
        }
        //System.out.println("No. of nodes in the linked list = "+c);
        return c;
    }

    private ListNode reverse() throws CloneNotSupportedException
    {        
        ListNode rev=null,temp=head,node=null;
        while(temp!=null)
        {
            node=(ListNode)temp.clone();
            node.setNext(rev);
            rev=node;
            temp=temp.getNext();
        }
        return  rev;
    }
    /*
    1 2 3 4 5
    2 1    3 4 5 
    */
   
    private ListNode rev(ListNode head,ListNode rev) throws CloneNotSupportedException
    {
        if(head==null)
        {
            return rev;
        }
        else
        {
            ListNode node=(ListNode)head.clone();
            node.setNext(rev);
            rev=node;
            return rev(head.getNext(),rev);
        }
    }
   
}
