package linkedlists;

public class Linkedlists
{
    Node head;
    
    class Node
    {
       int data;
       Node next=null;
       public Node(int data){this.data=data;}
    }
   
   public static void main(String[] args) 
   {
       Linkedlists l=new Linkedlists();
       l.operate();
       l.display();
   
   }
   
   private void operate()
    {
     Node n1=new Node(5);
     Node n2=new Node(6);
     Node n3=new Node(7);
     Node n4=new Node(8);
     Node n5=new Node(9);
     n1.next=n2;
     n2.next=n3;
     n3.next=n4;
     n4.next=n5;
     head=n1;
    }
   
    private void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    
}
