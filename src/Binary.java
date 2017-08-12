
import java.util.ArrayList;

public class Binary
{
    ArrayList<Integer> arrayList=new ArrayList();
    
    public Binary(ArrayList<Integer> arrayList)
    {
        this.arrayList=arrayList;
    }
    
    public void binary(int n)
    {
        if(n<1)
        {
            System.out.println(arrayList);
        }
        else
        {
            arrayList.set(n-1, 0);
            binary(n-1);
            arrayList.set(n-1, 1);
            binary(n-1);
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        Binary obj=new Binary(arrayList);
        obj.binary(2);
    }
    
}
