/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disjointsets;

import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Execute
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        DisjointSet set=new DisjointSet(n);
        int q=sc.nextInt();
        for (int i = 0; i < q; i++)
        {
            switch(sc.next().charAt(0))
            {
                case 'Q':
                    int number=sc.nextInt();
                    System.out.println(set.groupSize(number));;
                    break;
                case 'M':
                    int x=sc.nextInt();
                    int y=sc.nextInt();
                    set.merge(x, y);
                    break;
            }
        }
    }
}
