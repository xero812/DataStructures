/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Adesh Srivastava
 */
public class Main
{
    public static void main(String[] args)
    {
        BinaryTreeNode n1=new BinaryTreeNode(1);
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Queue<BinaryTreeNode> queue=new LinkedList();
        queue.offer(n1);
        for (int i = 0; i < n; i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            BinaryTreeNode child1 = new BinaryTreeNode(a);
            BinaryTreeNode child2 = new BinaryTreeNode(b);
            BinaryTreeNode parent=null;
            while(true)
            {
                parent=queue.poll();
                if(parent.getData()!=-1)
                    break;
            }
            parent.setLeft(child1);
            parent.setRight(child2);
            queue.offer(child1);
            queue.offer(child2);
        }
        int t=sc.nextInt();
        int []testCase=new int[t];
        for (int i = 0; i < t; i++)
        {
            testCase[i]=sc.nextInt();
        }
        int h=height(n1);
        h++;
        for (int i = 0; i < t; i++)
        {
            int q=testCase[i];
            for (int j = 1; q*j <= h; j++)
            {
                Queue<BinaryTreeNode> qq=new LinkedList();
                drill(n1, 1, j*q, qq);
                while(!qq.isEmpty())
                {
                    BinaryTreeNode p=qq.poll();
                    BinaryTreeNode l=p.getLeft();
                    BinaryTreeNode r=p.getRight();
                    p.setLeft(r);
                    p.setRight(l);
                }
            }
            inOrderTraversal(n1);
            System.out.println();
        }
            
    
            
        
    }
    
    public static void inOrderTraversal(BinaryTreeNode node)
    {
        if(node!=null)
        {
            inOrderTraversal(node.getLeft());
            if(node.getData()!=-1)
                System.out.print(node.getData()+" ");
            inOrderTraversal(node.getRight());
        }
    }
    
    
    public static void  drill (BinaryTreeNode n, int clevel, int rlevel,Queue<BinaryTreeNode> result) 
    {
        if (clevel == rlevel) 
            result.offer(n);
        else 
        {
            if (n.getLeft() != null)
                drill (n.getLeft(), clevel + 1, rlevel, result);
            if (n.getRight() != null)
                drill (n.getRight(), clevel + 1, rlevel, result);
        }
    }
    
    public static int height(BinaryTreeNode root)
    {
        if(root==null)
            return -1;
        else
            return 1+Math.max(height(root.getLeft()), height(root.getLeft()));
            

    }
 
}
