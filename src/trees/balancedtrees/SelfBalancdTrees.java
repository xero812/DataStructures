/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees.balancedtrees;

public class SelfBalancdTrees 
{
    public static void main(String[] args)
    {
        AVLTreeNode n=null;
        n=insert(n,10);
        n=insert(n,20);
        n=insert(n,30);
        n=insert(n,40);
        n=insert(n,50);
        
        preOrder(n);
    }

    public static AVLTreeNode singleRotateLeft(AVLTreeNode X)
    {
        AVLTreeNode W=X.getLeft();
        X.setLeft(W.getRight());
        W.setRight(X);
        X.setHeight(Math.max(height(X.getLeft()), height(X.getRight()))+1);
        W.setHeight(Math.max(height(W.getLeft()), height(W.getRight()))+1);
        return W;
    }
    
    public static AVLTreeNode singleRotateRight(AVLTreeNode W)
    {
        AVLTreeNode X=W.getRight();
        W.setRight(X.getLeft());
        X.setLeft(W);
        X.setHeight(Math.max(height(X.getLeft()), height(X.getRight()))+1);
        W.setHeight(Math.max(height(W.getLeft()), height(W.getRight()))+1);
        return X;
    }
    
    public static int height(AVLTreeNode X)
    {
        if(X==null)
            return -1;
        return X.getHeight();
    }
    
    public static AVLTreeNode doubleRotateLeft(AVLTreeNode Z)
    {
        Z.setLeft(singleRotateRight(Z.getLeft()));
        return singleRotateLeft(Z);
    }
    
    public static AVLTreeNode doubleRotateRight(AVLTreeNode X)
    {
        X.setRight(singleRotateLeft(X.getRight()));
        return singleRotateRight(X);
    }

    private static AVLTreeNode insert(AVLTreeNode n, int data)
    {
        if(n==null)
        {
            n=new AVLTreeNode(data);
            n.setLeft(null);
            n.setRight(null);
            n.setHeight(0);
        }
        else if(n.getData()>data)//goLeft
        {
            n.setLeft(insert(n.getLeft(),data));
            //balance
            if(Math.abs(height(n.getLeft())-height(n.getRight()))>1)
            {
                if(n.getLeft().getData()>data)
                    n=singleRotateLeft(n);
                else
                    n=doubleRotateLeft(n);
            } 
        }
        else if(n.getData()<data)//goRight
        {
            n.setRight(insert(n.getRight(), data));
            //balance
            if(Math.abs(height(n.getLeft())-height(n.getRight()))>1)
            {
                if(n.getRight().getData()<data)
                    n=singleRotateRight(n);
                else
                    n=doubleRotateRight(n);
            } 
        }
        //data is there
        n.setHeight(Math.max(height(n.getLeft()),height(n.getRight()))+1);
        return n;
    }

    private static void preOrder(AVLTreeNode n)
    {
        if(n!=null)
        {
            System.out.println(n.getData());
            preOrder(n.getLeft());
            preOrder(n.getRight());
        }
    }
}