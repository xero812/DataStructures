/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees.balancedtrees;

/**
 *
 * @author Adesh Srivastava
 */
public class AVLTreeNode
{
    int data;   //Value
    int height;      //Height
    AVLTreeNode left;   //Left child
    AVLTreeNode right;   //Right child

    public AVLTreeNode(int data)
    {
        this.data = data;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public AVLTreeNode getLeft()
    {
        return left;
    }

    public void setLeft(AVLTreeNode left)
    {
        this.left = left;
    }

    public AVLTreeNode getRight()
    {
        return right;
    }

    public void setRight(AVLTreeNode right)
    {
        this.right = right;
    }
    
    
    
}
