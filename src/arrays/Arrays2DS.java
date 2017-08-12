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
public class Arrays2DS
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[6][6];
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int res=a[0][0]+a[0][1]+a[0][2]+a[1][1]+a[2][0]+a[2][1]+a[2][2];
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                int t=a[i][j]+a[i][j+1]+a[i][j+2] + a[i+1][j+1] + a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(t>res)
                    res=t;
                    
            }
        }
        System.out.println(res);
    }
    
}
