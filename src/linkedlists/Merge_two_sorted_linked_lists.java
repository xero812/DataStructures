/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Merge_two_sorted_linked_lists
{
    
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ListNode a=input(),b=input();
        
        displayNodes(a);
        displayNodes(b);
        
        
        
        
        ListNode result=null;
        while(a!=null && b!=null)
        {
            System.out.println("Hello");
            if(a.getData()<b.getData())
            {
                result=insertAtEnd(result, new ListNode(a.getData()));
                a=a.getNext();
            }
            else
            {
                result=insertAtEnd(result, new ListNode(b.getData()));
                b=b.getNext();
            }
        }
        displayNodes(result);
        if(a!=null)
            result=insertAtEnd(result, a);
        if(b!=null)
            result=insertAtEnd(result, b);
        
        
        
        displayNodes(result);
        
        
        
    }
    
    
    
    private static ListNode input()
    {
        ListNode a=null;
        String data;
        while(!"NULL".equalsIgnoreCase(data=sc.next()))
        {
            ListNode temp=new ListNode(Integer.parseInt(data));
            if(a==null)
                a=temp;
            else
            {
                ListNode t=a;
                while(t.getNext()!=null)
                    t=t.getNext();
                t.setNext(temp);
            }
        }
        return a;
    }
    
    private static void displayNodes(ListNode temp) throws CloneNotSupportedException
    {
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    private static ListNode insertAtEnd(ListNode head,ListNode endNode)
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
        return head;
    }
    
}
