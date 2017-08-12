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
public class ExecuteHeaps
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>((Integer t1, Integer t) -> t1.compareTo(t));
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            switch(sc.nextInt())
            {
                case 1:
                    heap.offer(sc.nextInt());
                    break;
                case 2:
                    heap.remove(sc.nextInt());
                    break;
                case 3:
                    System.out.println(heap.peek());
                    break;
            }
        }
    }
}
