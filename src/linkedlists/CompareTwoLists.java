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
public class CompareTwoLists
{
    static Scanner sc = new Scanner(System.in);
        
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ListNode a=null,b=null;
        a=input();
        b=input();
        boolean f=true;
        while(true)
        {
            if(a==null && b==null)
            {
                break;
            }
            else if(a!=null && b==null)
            {
                f=!true;
                break;
            }
            else if(a==null && b!=null)
            {
                f=!true;
                break;
            }
            else
            {
                int dataA=a.getData();
                int dataB=b.getData();
                if(dataA!=dataB)
                {
                    f=!true;
                    break;
                }
                a=a.getNext();
                b=b.getNext();
            }
        }
        if(f)
            System.out.println(1);
        else
            System.out.println(0);
        
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
    
    
}
