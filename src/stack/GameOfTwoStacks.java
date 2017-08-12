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
public class GameOfTwoStacks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int nA=sc.nextInt();int []aa=new int[nA];
            int nB=sc.nextInt();int []bb=new int[nB];
            int total=sc.nextInt();
            for (int j = 0; j < nA; j++)
            {
                aa[j]=sc.nextInt();
            }
            for (int j = 0; j < nB; j++)
            {
                bb[j]=sc.nextInt();
            }
            Stack<Integer> a=new Stack();
            Stack<Integer> b=new Stack();
            for (int j = nA-1; j >= 0; j--)
            {
                a.push(aa[j]);
            }
            for (int j = nB-1; j >= 0; j--)
            {
                b.push(bb[j]);
            }
            
            int sum=0,count=0;
            while(true)
            {
                if(!a.isEmpty() && !b.isEmpty())
                {
                    int n1=a.peek();
                    int n2=b.peek();
                    if(n1>n2)
                    {
                        sum+=b.pop();
                    }
                    else
                    {
                        sum+=a.pop();
                    }
                }
                else if(a.isEmpty() && !b.isEmpty())
                {
                    sum+=b.pop();
                }
                else if(!a.isEmpty() && b.isEmpty())
                {
                    sum+=a.pop();
                }
                else
                {
                    break;
                }
                if(sum>total)
                {
                    break;
                }
                else
                    count++;
                
                System.out.println(a+"\n"+b);
                System.out.println(sum+"\n"+count);
            }
            System.out.println(count);
        }
        
        
        
    }
}
