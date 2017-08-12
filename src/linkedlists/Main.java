package linkedlists;



public class Main
{
    public static void main(String[] args)
    {
        
    }

    private void operate()
    {
        Tree n=new Tree();
        n.setData(1);
        
        Tree n1=new Tree();
        n1.setData(2);
        Tree n2=new Tree();
        n2.setData(3);
        Tree n3=new Tree();
        n3.setData(4);
        
        n.setLeft(n1);
        //n.setRight(n2);
        //n1.setLeft(n3);
        
        System.out.println(getCount(n));
        
    }
    
    public int getCount(Tree node)
    {
        System.out.println(node.getData()+" "+node.getLeft()+" "+node.getRight());
        if(node==null)
            return 0;
        else if(node.getLeft()==null && node.getRight()==null)
            return 1;
        else
            return getCount(node.getLeft())+getCount(node.getRight());
    }
    
    
    
}
