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
public class GetFromTail
{
    static Scanner sc = new Scanner(System.in);

    
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
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
    
    private static void getNodeValue(ListNode head, int n) throws CloneNotSupportedException
    {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.getNext();
        }
        c=c-n;
        temp=head;
        int i=0;
        while(i<c-1)
        {
            temp=temp.getNext();
            i++;
        } 
        System.out.println(temp.getData());

    }

    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ListNode a=input();
        displayNodes(removeDuplicated(a));
    }

    
    private static ListNode removeDuplicated(ListNode a) throws CloneNotSupportedException
    {
        ListNode temp=a;
        
        while(temp!=null)
        {
            temp.setNext(removeElement(temp.getNext(),temp.getData()));
            temp=temp.getNext();
            displayNodes(a);
        }
        
        
        
        return a;
    }
    
    
    private static ListNode removeElement(ListNode a,int data) throws CloneNotSupportedException
    {
        
        if(a==null)
            return null;
        
        
        
        ListNode temp=a;
        while(temp!=null)
        {
            if(temp.getData()==data)
            {
                a=a.getNext();
                temp=a;
            }
            else
                break;
        }
        
        if(a==null)
            return null;
        
        ListNode prev = a;
        ListNode next = a.getNext();
        
        
        while(next!=null)
        {
            if(data==(next.getData()))
            {
                prev.setNext(next.getNext());
            }
            else
            {
                prev = next;
            }
            next = next.getNext();
        }
        return a;
    }
    
}

