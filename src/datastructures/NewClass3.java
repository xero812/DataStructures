/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass3
{
    static public int length=1000000;
    public static void main(String[] args) throws IOException
    {
        File f=new File("C:\\Users\\Adesh Srivastava\\Desktop\\test.txt");
        FileReader in=new FileReader(f);
        
        Thread t=new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                int m=0;
                int i=0;
                while(true)
                {
                    try
                    {
                        m=in.read();
                    } 
                    catch (IOException ex)
                    {
                        Logger.getLogger(NewClass3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(i==length/2)
                        break;
                    System.out.print((char)m);
                    if(i++%10==0)
                        System.out.println();
  
                }
        
                
            }
        });
        t.start();
        
        Thread t1=new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                int m=0;
                int i=0;
                while(true)
                {
                    try
                    {
                        m=in.read();
                    } 
                    catch (IOException ex)
                    {
                        Logger.getLogger(NewClass3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(i==length/2)
                        break;
                    System.out.print((char)m);
                    if(i++%10==0)
                        System.out.println();
  
                }
        
                
            }
        });
        t1.start();
    }
    
    

    
}



