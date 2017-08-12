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
public class SparseArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[]data=new String[n];
        for (int i = 0; i < n; i++)
        {
            data[i]=sc.next();
        }
        int q=sc.nextInt();
        String []query=new String[q];
        for (int i = 0; i < q; i++)
        {
            query[i]=sc.next();
        }
        for (int i = 0; i < q; i++)
        {
            String temp=query[i];
            int c=0;
            for (int j = 0; j < n; j++)
            {
                if(data[j].equals(temp))
                    c++;
            }
            System.out.println(c);
        }
    }
    
}
