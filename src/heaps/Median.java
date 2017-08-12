/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaps;

/**
 *
 * @author Adesh Srivastava
 */
public class Median
{
    public static void main(String[] args)
    {
        MedianHeap heap=new MedianHeap(5);
        heap.insert(12);//System.out.println(heap.median());
        heap.insert(4);//System.out.println(heap.median());
        heap.insert(5);//System.out.println(heap.median());
        heap.insert(3);//System.out.println(heap.median());
        heap.insert(8);//System.out.println(heap.median());
        heap.insert(7);//System.out.println(heap.median());
        
    }
}
