/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Adesh Srivastava
 */
public class Max
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> mStack=new Stack<>();
        
        for (int i = 0; i < n; i++)
        {
            int choice=sc.nextInt();
            if(choice==1)
            {
                int e=sc.nextInt();
                stack.push(e);
                if(mStack.isEmpty())
                {
                    mStack.push(e);
                    continue;    
                }
                if(e>mStack.peek())
                    mStack.push(e);
                else
                    mStack.push(mStack.peek());
            }
            else if(choice==2)
            {
                stack.pop();
                mStack.pop();
            }
            else if(choice==3)
                System.out.println(mStack.peek());
        }
    }
    
    
    
}
