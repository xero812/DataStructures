/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class AlgorithmCrush
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        long m=sc.nextInt();
        long []d=new long[(int)n];
        for (int i = 0; i < m; i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int val=sc.nextInt();
            for (int j = a-1; j < b; j++)
            {
                d[j]+=val;
            }
        }
        long max=d[0];
        for (int i = 1; i < n; i++)
        {
            if(max<d[i])
                max=d[i];
        }
        System.out.println(max);
    }
    
}
