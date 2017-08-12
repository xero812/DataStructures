/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package stack;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stac
public class Cylinders
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int []d1=new int[n1];
        int []d2=new int[n2];
        int []d3=new int[n3];
        Stack<Integer> a=input(d1,sc);
        Stack<Integer> b=input(d2,sc);
        Stack<Integer> c=input(d3,sc);
        
        
        
        
        while(true)
        {
            if(sumOfElements(a)==sumOfElements(b) && sumOfElements(a)==sumOfElements(c))
            {
                System.out.println(sumOfElements(a));
                break;
            }
            else
            {
                if(sumOfElements(a)>sumOfElements(b) && sumOfElements(a)>sumOfElements(c))
                    a.pop();
                else if(sumOfElements(b)>sumOfElements(a) && sumOfElements(b)>sumOfElements(c))
                    b.pop();
                else
                    c.pop();
            }
            
            
            
            
        }
        
        
    }

    private static Stack<Integer> input(int[] d,Scanner sc)
    {
        for (int i = 0; i < d.length; i++)
        {
            d[i]=sc.nextInt();
        }
        Stack<Integer> s=new Stack<>();
        for (int i = d.length-1; i >= 0; i--)
        {
            s.push(d[i]);
        }
        return s;
    }

    private static int sumOfElements(Stack<Integer> a)
    {
        
        Object []sum=a.toArray();
        int s=0;
        for (Object sum1 : sum)
        {
            s = s + (int) sum1;
        }
        return s;
    }

    private static int maxOfThree(Integer a, Integer b, Integer c)
    {
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
    
    public static void f(Stack<Integer> stack1,Stack<Integer> stack2,Stack<Integer> stack3)
    {
    while (!(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty())) {

      int top1 = stack1.peek();
      int top2 = stack2.peek();
      int top3 = stack3.peek();

      if ((top1 == top2 && top2 == top3))
        break;

      int min = Math.min(top1, Math.min(top2, top3));

      if (top1 > min)
        stack1.pop();

      if (top2 > min)
        stack2.pop();

      if (top3 > min)
        stack3.pop();
    }

    if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty())
      System.out.println(0);
    else
      System.out.println(stack1.peek());
    }
}

*/








package stack;

import java.util.*;
class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int s1=0,s2=0,s3=0;
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int top1,top2,top3;
        int h1[] = new int[n1];
        int h2[] = new int[n2];
        int h3[] = new int[n3];
        for(top1=n1-1;top1>=0;top1--)
        {
            h1[top1] = in.nextInt();
            s1=s1+h1[top1];
        }
        for(top2=n2-1;top2>=0;top2--)
        {
            h2[top2] = in.nextInt();
            s2=s2+h2[top2];
        }
        for(top3=n3-1;top3>=0;top3--)
        {
            h3[top3] = in.nextInt();
            s3=s3+h3[top3];
        }
        if(s1==s2 && s2==s3)
        {
            System.out.println(s1);
        }
        else
        {
            top1=n1-1;
            top2=n2-1;
            top3=n3-1;
            while(s1!=s2 || s2!=s3)
            {
                while(s1>s2 || s1>s3)
                {
                    s1=s1-h1[top1];
                    top1=top1-1;
                }
                while(s2>s1 || s2>s3)
                {
                    s2=s2-h2[top2];
                    top2=top2-1;
                }
                while(s3>s2 || s3>s2)
                {
                    s3=s3-h3[top3];
                    top3=top3-1;
                }
            }
            System.out.println(s1);
        }
    
    }
}























