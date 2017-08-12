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
public class DynamicArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int [][]seq=new int[n][];
        int [][]query=new int[q][3];
        for (int i = 0; i < q; i++)
        {
            query[i][0]=sc.nextInt();
            query[i][1]=sc.nextInt();
            query[i][2]=sc.nextInt();
        }
        int lastAns=0;
        for (int i = 0; i < q; i++)
        {
            int x=query[i][1];
            int y=query[i][2];
            if(query[i][0]==1)
            {
                int seqNumber=(x^lastAns)%n;
                if(seq[seqNumber]!=null)
                {
                    int []temp=new int[seq[seqNumber].length+1];
                    for (int j = 0; j < temp.length-1; j++)
                    {
                        temp[j]=seq[seqNumber][j];
                    }
                    temp[temp.length-1]=y;
                    seq[seqNumber]=temp;
                }
                else
                {
                    int []temp=new int[1];
                    temp[0]=y;
                    seq[seqNumber]=temp;
                }
                
            }
            else if(query[i][0]==2)
            {
                int seqNumber=(x^lastAns)%n;
                lastAns=seq[seqNumber][y%seq[seqNumber].length];
                System.out.println(lastAns);
            }
        }
        
    }
    
}
