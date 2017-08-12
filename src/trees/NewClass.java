/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass
{
    public static void main(String[] args)
    {
        BinaryTreeNode n1=new BinaryTreeNode(1);
        BinaryTreeNode n2=new BinaryTreeNode(2);
        BinaryTreeNode n3=new BinaryTreeNode(3);
        BinaryTreeNode n4=new BinaryTreeNode(4);
        BinaryTreeNode n5=new BinaryTreeNode(5);
        BinaryTreeNode n6=new BinaryTreeNode(6);
        BinaryTreeNode n7=new BinaryTreeNode(7);
        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        test(n1);
        
    }
    
    public static void test(BinaryTreeNode node)
    {
        ArrayList<Integer> result=new ArrayList();
        if(node==null)
            return;
        Stack<BinaryTreeNode> stack=new Stack();
        stack.push(node);
        while(!stack.isEmpty())
        {
            BinaryTreeNode currentNode=stack.peek();
            if(currentNode.getRight()==null && currentNode.getLeft()==null)
            {
                currentNode=stack.pop();
                result.add(currentNode.getData());
            }
            else
            {
                if(currentNode.getRight()!=null)
                {
                    stack.push(currentNode.getRight());
                    currentNode.setRight(null);
                }
                if(currentNode.getLeft()!=null)
                {
                    stack.push(currentNode.getLeft());
                    currentNode.setLeft(null);
                }

                        
            }
        }
        System.out.println(result);
    
    }
    
    
    
}
