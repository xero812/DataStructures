/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Petrol
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Queue<LitAndDist> queue=new LinkedList();
        for (int i = 0; i < n; i++)
        {
            LitAndDist o=new LitAndDist(sc.nextInt(),sc.nextInt());
            queue.offer(o);
        }
        int loc=0;
        while(loc<n)
        {
            if(ifPasses(loc,queue))
            {
                System.out.println(loc);
                return;
            }
            LitAndDist o=queue.poll();
            queue.offer(o);
            loc++;
        }
        System.out.println("Not Found");
    }

    private static boolean ifPasses(int loc, Queue<LitAndDist> queue)
    {
        System.out.println(loc+" "+queue);
        Queue<LitAndDist> q=new LinkedList(queue);
        int lit=0;
        while(!q.isEmpty())
        {
            LitAndDist o=q.poll();
            lit+=o.getL();
            if(lit<o.getD())
            {
                return false;
            }
            else
            {
                lit-=o.getD();
            }
        }
        return true;
    }
    
}


class LitAndDist
{
    int l;
    int d;

    public LitAndDist(int l, int d)
    {
        this.l = l;
        this.d = d;
    }

    
    
    public int getL()
    {
        return l;
    }

    public void setL(int l)
    {
        this.l = l;
    }

    public int getD()
    {
        return d;
    }

    public void setD(int d)
    {
        this.d = d;
    }

    @Override
    public String toString()
    {
        return "LitAndDist{" + "l=" + l + ", d=" + d + '}';
    }
    
    
    
}