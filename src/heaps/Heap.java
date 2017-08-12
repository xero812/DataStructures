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
public class Heap
{
    public int [] array;
    public int count;
    public int capacity;
    public int heap_type;
    
    public Heap(int capacity,int heap_type)
    {
        this.heap_type=heap_type;
        this.count=0;
        this.capacity=capacity;
        this.array=new int [capacity];
    }
    
    public int parent(int i)
    {
        if(i<=0 || i>=this.count)
            return -1;
        return (i-1)/2;
    }
    
    public int leftChild(int i)
    {
        return ((2*i+1)>=this.count)?(-1):(2*i+1);
    }
    
    public int rightChild(int i)
    {
        return ((2*i+2)>=this.count)?(-1):(2*i+2);
    }
    
    public int getMax()
    {
        if(this.count==0)
            return -1;
        return this.array[0];
    }
    
    public void percolateDown(int i)
    {
        int l=leftChild(i);
        int r=rightChild(i);
        int max,temp;
        if(i!=-1 && this.array[l]>this.array[i])
        {
            max=l;
        }
        else
            max=i;
        if(i!=-1 && this.array[r]>this.array[i])
        {
            max=r;
        }
        if(max!=i)
        {
            temp=this.array[max];
            this.array[max]=this.array[i];
            this.array[i]=temp;
        }
        if(this.array[max]!=-1)
            percolateDown(max);
    }
    
    public int deleteMax()
    {
        int data=this.array[0];
        this.array[0]=this.array[this.capacity-1];
        this.capacity--;
        percolateDown(0);
        return data;
    }
    
    public void reSizeHeap()
    {
        int []array_old=new int[this.capacity];
        System.arraycopy(this.array, 0, array_old, 0,this.array.length);
        this.array=new int[this.capacity*2];
        System.arraycopy(array_old, 0,this.array , 0,array_old.length);
        this.capacity*=2;
    }
    
    public void insert(int data)
    {
        if(this.count==this.capacity)
            reSizeHeap();
        this.count++;
        int i=this.count-1;
        while(i>=0 && data>this.array[(i-1)/2])
        {
            this.array[i]=this.array[i/2];
            i=(i-1)/2;
        }
        this.array[i]=data;
    }
    
}
