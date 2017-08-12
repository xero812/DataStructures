package disjointsets;

public class DisjointSet
{
    
    int [] data,parent;
    int size;
    int count;
    
    public DisjointSet(int initialSize)
    {
        this.data=new int[initialSize];
        this.parent=new int[initialSize];
        this.size=initialSize;
        for (int i = 0; i < this.size; i++)
        {
            data[i]=parent[i]=i+1;
        }
        this.count=this.size;
    }
    
    /*
    
    public void insert(int value)
    {
        this.count++;
        this.data[this.count-1]=value;
        this.parent[this.count-1]=value;
    }
    

    private void resize()
    {
        //data
        int []array_old=new int[this.size];
        System.arraycopy(this.data, 0, array_old, 0,this.data.length);
        this.data=new int[this.size*2];
        System.arraycopy(array_old, 0,this.data , 0,array_old.length);
        //parent
        array_old=new int[this.size];
        System.arraycopy(this.parent, 0, array_old, 0,this.parent.length);
        this.parent=new int[this.size*2];
        System.arraycopy(array_old, 0,this.parent , 0,array_old.length);
        this.size*=2;
    }
    */
    
    public void show()
    {
        System.out.println("Parent");
        for (int i = 0; i < this.parent.length; i++)
            System.out.print(this.parent[i]+" ");
        System.out.println();
        System.out.println("Data");
        for (int i = 0; i < this.data.length; i++)
            System.out.print(this.data[i]+" ");
        System.out.println();
    }

    @Override
    public String toString()
    {
        return "DisjointSet{" + "data=" + data + ", parent=" + parent + ", size=" + size + ", count=" + count + '}';
    }
    
    public void merge(int x,int y)
    {
        int i=findIndex(x);
        int j=findIndex(y);
        
        int pX=parent[i];
        int pY=parent[j];
        int newP=Math.min(pX, pY);
        for (int k = 0; k < this.size; k++)
        {
            if(parent[k]==pX||parent[k]==pY)
                parent[k]=newP;
        }
        
    }
    
    private int findIndex(int n)
    {
        for (int i = 0; i < this.size; i++)
        {
            if(this.data[i]==n)
                return i;
        }
        return -1;
    }
    
    public int groupSize(int n)
    {
        int j=findIndex(n);
        int p=parent[j];
        int c=0;
        for (int i = 0; i < this.size; i++)
        {
            if(parent[i]==p)
                c++;
        }
        return c;
    }
}