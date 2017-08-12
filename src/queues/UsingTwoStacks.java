/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Adesh Srivastava
 */
public class UsingTwoStacks
{
    
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            switch(sc.nextInt())
            {
                case 1:
                    enQueue(sc.nextInt());
                    break;
                case 2:
                    deQueue();
                    break;
                case 3:
                    printFront();
                    break;
            }
        }
    }

    private static void enQueue(int nextInt)
    {
        s1.push(nextInt);
    }

    private static void deQueue()
    {
        if(!s2.isEmpty())
        {
            s2.pop();
            return;
        }
        while(!s1.isEmpty())
            s2.push(s1.pop());
        s2.pop();
    }

    private static void printFront()
    {
        if(!s2.isEmpty())
            System.out.println(s2.peek());
        else
        {
            while(!s1.isEmpty())
                s2.push(s1.pop());
            System.out.println(s2.peek());
        }
        
    }
    
}
