/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlists;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adesh Srivastava
 */

public class DeleteDuplicate
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(6);
        ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        ListNode n=deleteDuplicate(n1);
        display(n);
    }

    private static ListNode deleteDuplicate(ListNode n) throws CloneNotSupportedException
    {
        System.out.println("jjj");
        ListNode n1=n;
        Map<Integer,Boolean> table=new HashMap<>();
        ListNode prev=null;
        while(n!=null)
        {
            if(table.containsKey(n.getData()))
            {
                prev.setNext(n.getNext());
            }
            else
            {
                table.put(n.getData(), true);
                prev=n;
            }
            n=n.getNext();       
        }
        return n1;
    }
    
    private static void display(ListNode n) throws CloneNotSupportedException
    {
        while(n!=null)
        {
            System.out.println(n.getData());
            n=n.getNext();
        }
    }
    
    private static ListNode removeMatched(ListNode head,ListNode node) throws CloneNotSupportedException
    {
        if(head==null)
        {
            return null;
        }
        if(head.getData()==node.getData())
        {
            head=head.getNext();
            return head;
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
        return head;
    }
    
}
