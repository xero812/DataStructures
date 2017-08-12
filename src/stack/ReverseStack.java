/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;


/**
 *
 * @author Adesh Srivastava
 */
public class ReverseStack
{
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Original = "+s);
        reverse(s);
        System.out.println("Reversed = "+s);
    }

    private static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()) return;
        int t=s.pop();
        reverse(s);
        insertAtBottom(s,t);
        System.out.println(s);
          
    }

    private static void insertAtBottom(Stack<Integer> s, int d)
    {
        if(s.isEmpty())
        {
            s.push(d);
            return;
        }
        int t=s.pop();
        insertAtBottom(s, d);
        s.push(t);
         
    }
    
}
