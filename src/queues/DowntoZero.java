/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Adesh Srivastava
 */

public class DowntoZero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        for (int i = 0; i < q; i++)
        {
            System.out.println(printSteps(sc.nextInt()));
        }
    }

    private static int printSteps(int n)
    {
        int result=0;
        Queue<Integer> curr=new LinkedList();
        Queue<Integer> nxt=new LinkedList();
        curr.offer(n);
        while(true)
        {
            int s=0;
            while(!curr.isEmpty())
            {
                s=curr.poll();
                if(s==0)
                    break;
                nxt.offer(s-1);
                int hF=highestFactor(s);
                if(hF!=1)
                    nxt.offer(hF);     
            }
            if(s==0)
                break;
            curr=new LinkedList(nxt);
            nxt.clear();
            result++;
        }   
        return result;
    }

    private static Integer highestFactor(int s)
    {
        TreeSet<Integer> a=new TreeSet<>();
        for (int i = 2; i <= s/2; i++)
        {
            if(s%i==0)
            {
                if(s/i>=i)
                    a.add(s/i);
            }
        
        }
        if(a.size()>0)
            return a.first();
        return 1;
    }
    
    
    
}
