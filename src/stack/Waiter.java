/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package stack;

import java.util.Scanner;

public class Waiter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
    //        System.out.println(nthprime(i));
    
        }
        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println(nthprime(i));
        }
    }
    
    public static int nthprime(int n)
    {
        int c=1;
        int ans=2;
        for (int i = 2;; i++)
        {
            if(isprime(i))
            {
                if(c==n)
                {
                    ans=i;
                    break;
                }
                else
                    c++;
            }
        }
        return ans;
    }

    private static boolean isprime(int i)
    {
        int c=0;
        for (int j = 1; j <= i; j++)
        {
            if(i%j==0)
                c++;
        }
        if(c==2)
            return true;
        return false;
    }
    
    
    
}
*/


import java.io.*;
import java.util.*;

class Solution1 
{

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();

		// 5 1
		// 3 4 7 6 5 
		int[] a = new int[N];
		
		Stk stkA = new Stk(N);
		Stk stkA1 = new Stk(N);
		Stk stkB = new Stk(N);
		Stk temp = new Stk(N);
		
		List<Integer> primLst = getListOfPrimes(Q);

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			stkA.push(a[i]);
		}
		temp = stkA;
		for (int i = 0; i < Q; i++) {
			
			while(temp.getCurrentPointer()!=-1){
			
				int prim = primLst.get(i);
				
				int item = temp.peep();
				//System.out.printf("prim--%d item-->%d \n",prim,item);
				if(item%prim==0){
					stkB.push(item);
					
				}
				else{
					stkA1.push(item);
				}
				temp.pop();
			
			}
			
			while(stkB.getCurrentPointer()!=-1){
			  System.out.println(stkB.pop());
			}
			
			temp = stkA1;
			stkA1=new Stk(N);
			
			/*if(temp.getCurrentPointer()==-1)
				break;*/
		}

		while(temp.getCurrentPointer()!=-1){
			  System.out.println(temp.pop());
			}
		

		

		

	}

	
	public static List<Integer> getListOfPrimes(int end)
    {
            List<Integer> lstInt = new ArrayList<Integer>();
//System.out.println("end--"+end);
            //lstInt.add(1);
            lstInt.add(2);
            boolean flag = true;
            int k = 2;
            for (int i = 0; lstInt.size() < end; i++)
            {
                    flag = true;
                    k++;
                    int sqI = (int)Math.sqrt(k);
                    for (int j = 2; j <= sqI; j++)
                    {
                            if (k % j == 0)
                            {
                                    flag = false;
                                    break;
                            }

                           
                    }
                    if (flag == true)
                    {
                            lstInt.add(k);
                    }
            }
            return lstInt;
    }
	
}

class Stk {

	private int[] stkArr = null;

	private static int[] stkMaxArr = null;

	private static int maxPointer = 0;

	private int currentPointer = -1;

	private int size = 0;

	private int total = 0;

	public Stk(int size) {
		super();
		this.size = size;
		stkArr = new int[size];
	}

	public void push(int x) {
		currentPointer++;
		stkArr[currentPointer] = x;

		total = total + x;

	}

	public int getTotal() {
		return total;
	}

	public int pop() {
		int val = stkArr[currentPointer];
		stkArr[currentPointer] = 0;
		currentPointer--;

		total = total - val;

		return val;

	}

	public int peep() {
		if (currentPointer > -1)
			return stkArr[currentPointer];
		else
			return -99;
	}

	public int getCurrentPointer() {
		return currentPointer;
	}

	public int getSize() {
		return size;
	}

	public int getMax() {
		return stkMaxArr[maxPointer];
	}
}