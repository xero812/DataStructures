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
public class LeftRotation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        /*
        1 2 3 4 5
        2 3 4 5 1
        3 4 5 1 2
        4 5 1 2 3
        5 1 2 3 4
        
        
        */
        
        for (int i = d; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i < d; i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
    
}
