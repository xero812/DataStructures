
package heaps;

import java.util.PriorityQueue;

public class MedianHeap 
{
    private final PriorityQueue<Integer> minheap;
    private final PriorityQueue<Integer> maxheap;
    public MedianHeap(int n) 
    {
        minheap = new PriorityQueue<>(n);
        maxheap = new PriorityQueue<>(n, (Integer x,Integer y)->(y.compareTo(x)));
    }
    
    private boolean isEmpty() 
    {
        return minheap.isEmpty() && maxheap.isEmpty();
    }
    
    public void insert(int x) 
    {
        if(isEmpty())
        {
            minheap.offer(x);
        }
        else
        {
            if((double)x<=median()) 
                maxheap.offer(x);
            else
                minheap.offer(x);
        }
        adjust();
        System.out.println(minheap);
        System.out.println(maxheap);
        System.out.println("*****");
        
    }
    
    private void adjust() 
    {
        if(Math.abs(maxheap.size()-minheap.size())>1) 
        {
            System.out.println("hh");
            if(maxheap.size() > minheap.size())
                minheap.add(maxheap.poll());
            else
                maxheap.add(minheap.poll());
        }
    }
    
    public double median() 
    {
        if(minheap.size()==maxheap.size())
            return ((double)minheap.peek()+maxheap.peek())/2;
        else if(maxheap.size()>minheap.size())
            return maxheap.peek();
        else
            return minheap.peek();
    }
}