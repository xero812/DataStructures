/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class CastleOnTheGrd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char [][]aray=new char[n][n];
        for (int i = 0; i < n; i++)
        {
            String s=sc.next();
            for (int j = 0; j < n; j++)
            {
                aray[i][j]=s.charAt(j);
            }
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int s=sc.nextInt();
        
        
        
    }
    
}
