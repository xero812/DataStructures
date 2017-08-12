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

public class Pesticids
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> in=new Stack<>();
        Stack<Integer> out=new Stack<>();
        while(n>0)
        {
            in.push(sc.nextInt());
            n--;
        }
        int c=0;
        while(oneGo(in, out))
            c++;
        System.out.println(c);
    }

    private static boolean oneGo(Stack<Integer> in, Stack<Integer> out)
    {
        boolean f=false;
        while(in.size()>1)
        {
            int x=in.pop();
            if(x<=in.peek())
                out.push(x);
            else
                f=true;
        }
            while(!out.isEmpty())
                in.push(out.pop());
        return f;
    }
    
}
