/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Cookies
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>((Integer t1, Integer t) -> t1.compareTo(t));
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for (int i = 0; i < n; i++)
            heap.offer(sc.nextInt());
        int c=0;
        boolean possible=true;
        while(heap.peek()<k)
        {
            if(heap.size()<2)
            {
                possible=false;
                System.out.println(-1);
                break;
            }
            int x=heap.poll();
            int y=heap.poll();
            heap.offer(x+2*y);
            c++;
        }
        if(possible)
            System.out.println(c);
    }
}
