/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class LongestRect
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
        int []s=new int[n];
        for (int i = 0; i < n; i++)
        {
            int t=a[i];
            int c=count(a,t,i);
            s[i]=t*c;
        }
        int max=s[0];
        for (int i = 1; i < n; i++)
        {
            if(s[i]>max)
                max=s[i];
        }
        System.out.println(max);
    }

    private static int count(int[] a, int x, int i)
    {
        
        int cL=0,cR=0;
        for (int j = i+1; j < a.length; j++)
        {
            if(a[j]>=x)
                cR++;
            else
                break;
        }
        for (int j = i-1; j >=0; j--)
        {
            if(a[j]>=x)
                cL++;
            else
                break;
            }
        return cL+cR+1; 
    }
    
}
