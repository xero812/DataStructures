
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ANDXOR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        int max=findMax(a, 1);
        for (int i = 2; i < n; i++)
        {
            if(findMax(a, i)>max)
                max=findMax(a, i);
        }
        System.out.println(max);
    }

    private static int formula(int a, int b)
    {
        return ((a&b)^(a|b))&(a^b);
    }

    private static int findMax(int[] a, int i)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for (int j = 0; j <= i; j++)
        {
            list.add(a[j]);
        }
        Collections.sort(list);
        int x=list.get(0);
        int y=list.get(1);
        
        return formula(x, y);
        
    }
    
    
}
 */

class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Stack<Integer> stk=new Stack<>();
        // int result=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty())
            {
                max=Math.max(max,arr[i]^stk.peek());
                if(arr[i]<stk.peek())
                {
                    stk.pop();
                  //if(result)
                    // break; 
                }
                else
                    break;
            }
            stk.push(arr[i]);
            System.out.println(stk+" "+max);
        }
        System.out.println(max);
    }
}


/*
5
9 6 3 5 2
*/

