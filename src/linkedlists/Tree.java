package linkedlists;

public class Tree
{
    int data;
    Tree left=null;
    Tree right=null;
    
    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Tree getLeft()
    {
        return left;
    }

    public void setLeft(Tree left)
    {
        this.left = left;
    }

    public Tree getRight()
    {
        return right;
    }

    public void setRight(Tree right)
    {
        this.right = right;
    }
    
}
