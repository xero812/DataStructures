package linkedlists;

import java.util.Scanner;
public class NewClass2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        for (int j = 0; j <= n1; j++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < n2; j++)
        {
            System.out.print("_");
        }
        System.out.println("");
        
        for (int i = 0; i < n1; i++)
        {
            for (int j = n1-1; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print("_|");
                break;
            }
            for (int j = 0; j < n2; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i); j++)
            {
                System.out.print(" ");
            }
            if(i<n3)
            System.out.print("|_");
            System.out.println();
        }
        for (int i = 0; i < (n3-n1); i++)
        {
            for (int j = 0; j < (2*n1+n2); j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("|_");
        }

    }
    
}
