package datastructures;
//search for akka
/**
 *
 * @author Adesh Srivastava
 */
public class Threads
{
    static int length=100000000;
    static int threadNumber=0;
    static Integer []a=new Integer[length];
    public static void main(String[] args)
    {
        for (int i = 0; i < length; i++)
        {
            a[i]=(int)(Math.random()*100);
        }
        
        /*
        for (int i = 0; i < length; i++)
        {
            if(a[i]==1)
            {
                System.out.println("Success");
                System.exit(0);
                        
            }
        }
        */
        
        
        for (int i = 0; i < 2; i++)
        {
            final int start=i*(length/2);
            final int end=(i+1)*(length/2);
            Thread t=new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (int j = start; j < end; j++)
                    {
                        if(a[j]==1)
                        {
                            System.out.println("Success");
                            System.exit(threadNumber);
                        }
                    }
                }
            });
            t.start();
            threadNumber++;
        }
        
        
        
        
        
    }
    
    
    public static <T extends Object> void disp(T[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
            if(i%10==9)
                System.out.println();
            if(i%(length/2-1)==0)
                System.out.println();
        }
    }
    

    
}


