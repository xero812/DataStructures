package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal
{
    
    BinaryTreeNode root;
    
    public void preOrderTraversal(BinaryTreeNode node)
    {
        if(node!=null)
        {
            System.out.println(node.getData());
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }
    
    public void inOrderTraversal(BinaryTreeNode node)
    {
        if(node!=null)
        {
            inOrderTraversal(node.getLeft());
            System.out.println(node.getData());
            inOrderTraversal(node.getRight());
        }
    }
      
    public void postOrderTraversal(BinaryTreeNode node)
    {
        if(node!=null)
        {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.println(node.getData());
        }
    }
    
    public void preOrderTraversalByIteration(BinaryTreeNode node)
    {
        ArrayList<Integer> result=new ArrayList();
        if(node==null)
            return;
        Stack<BinaryTreeNode> stack=new Stack();
        stack.push(node);
        while(!stack.isEmpty())
        {
            BinaryTreeNode temp=stack.pop();
            result.add(temp.getData());
            if(temp.getRight()!=null)
                stack.push(temp.getRight());
            if(temp.getLeft()!=null)
                stack.push(temp.getLeft());
        }
        System.out.println(result);
    }
    
    public void inOrderTraversalByIteration(BinaryTreeNode node)
    {
        ArrayList<Integer> result=new ArrayList();
        Stack<BinaryTreeNode> stack=new Stack();
        BinaryTreeNode currentNode=node;
        boolean done=false;
        while(!done)
        {
            if(currentNode!=null)
            {
                stack.push(currentNode);
                currentNode=currentNode.getLeft();
            }
            else
            {
                if(stack.isEmpty())
                    done=true;
                else
                {
                    currentNode=stack.pop();
                    result.add(currentNode.getData());
                    currentNode=currentNode.getRight();
                }
            }
        }
        System.out.println(result);
    }

    public void postOrderTraversalByIteration(BinaryTreeNode node)
    {
        ArrayList<Integer> res = new ArrayList();
        if(root==null) 
        {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()) 
        {
            BinaryTreeNode temp = stack.peek();
            if(temp.getLeft()==null && temp.getRight()==null) 
            {
                BinaryTreeNode pop = stack.pop();
                res.add(pop.getData());
            }
            else 
            {
                if(temp.getRight()!=null) 
                {
                    stack.push(temp.getRight());
                    temp.setRight(null);
                    temp.setLeft(null);
                }
                if(temp.getLeft()!=null) 
                {
                    stack.push(temp.getLeft());
                    temp.setLeft(null);
                    temp.setRight(null);       
                }
            }
        }
        System.out.println(res);
    }
    
    public int max(BinaryTreeNode node)
    {
        int max=Integer.MIN_VALUE;
        if(node!=null)
        {
            int l=max(node.getLeft());
            int r=max(node.getRight());
            if(l>r)
                max=l;
            else
                max=r;
            if(node.getData()>max)
                max=node.getData();
            
        }
        return max;
    }
    
    public int height(BinaryTreeNode root)
    {
        if(root==null)
            return -1;
        else
            return 1+Math.max(height(root.getLeft()), height(root.getLeft()));
    }
    
    public int count(BinaryTreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        else if(node.getLeft()==null && node.getRight()==null)
        {
            return 1;
        }
        else
            return 1+count(node.getLeft())+count(node.getRight());
    }
        
    public void levelTraversalBFS(BinaryTreeNode node)
    {
        if(node==null)
            return;
        Queue<BinaryTreeNode> q=new LinkedList();
        q.offer(node);
        while(!q.isEmpty())
        {
            BinaryTreeNode t=q.poll();
            System.out.println(t.getData());
            if(t!=null)
            {
                if(t.getLeft()!=null)
                    q.offer(t.getLeft());
                if(t.getRight()!=null)
                    q.offer(t.getRight());
            }
        }
    }

    public void levelTraversalDFS(BinaryTreeNode node)
    {
        if(node==null)
            return;
        Stack<BinaryTreeNode> q=new Stack();
        q.push(node);
        while(!q.isEmpty())
        {
            BinaryTreeNode t=q.pop();
            System.out.println(t.getData());
            if(t!=null)
            {
                if(t.getRight()!=null)
                    q.push(t.getRight());
                if(t.getLeft()!=null)
                    q.push(t.getLeft());
         
            }
        }
    }
    
    public void topView(BinaryTreeNode node)
    {
        Stack<Integer> stack=new Stack<Integer>();
        BinaryTreeNode temp=node;
        while(temp!=null)
        {
            stack.push(temp.getData());
            temp=temp.getLeft();    
        }
        while(!stack.isEmpty())
            System.out.print(stack.pop()+" ");
        temp=node;
        while(true)
        {
            temp=temp.getRight();
            System.out.print(temp.getData()+" ");
            if(temp.getRight()==null)
                break;
        }
    }

    public static void main(String[] args)
    {
        Traversal t=new Traversal();
        BinaryTreeNode n1=new BinaryTreeNode(1);
        BinaryTreeNode n2=new BinaryTreeNode(2);
        BinaryTreeNode n3=new BinaryTreeNode(3);
        BinaryTreeNode n4=new BinaryTreeNode(4);
        BinaryTreeNode n5=new BinaryTreeNode(5);
        BinaryTreeNode n6=new BinaryTreeNode(6);
        BinaryTreeNode n7=new BinaryTreeNode(7);
        BinaryTreeNode n8=new BinaryTreeNode(8);
        BinaryTreeNode n9=new BinaryTreeNode(9);
        
        n1.setLeft(n2);
        n1.setRight(n3);
        n3.setLeft(n6);
        n3.setRight(n7);
        n2.setLeft(n4);
        n2.setRight(n5);
        //n4.setRight(n8);
        //n7.setLeft(n9);
        t.root=n1;
        System.out.println("PreOrder");
        t.preOrderTraversalByIteration(t.root);
        System.out.println("InOrder");
        t.inOrderTraversalByIteration(t.root);
        System.out.println("PostOrder");
        t.postOrderTraversalByIteration(t.root);
        System.out.println(t.max(n1));
        
    }
    
    public int minn(BinaryTreeNode node)
    {   
        int min=Integer.MAX_VALUE;
        if(node!=null)
        {
            int l=minn(node.getLeft());
            int r=minn(node.getRight());
            if(l<r)
                min=l;
            else
                min=r;
            if(node.getData()<min)
                min=node.getData();
        }
        
        return min;
    }
    
    
    
}
