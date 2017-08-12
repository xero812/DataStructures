/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Adesh Srivastava
 */
public class NewClass4
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("C:\\Users\\Adesh Srivastava\\Desktop\\test.txt");
        FileWriter out=new FileWriter(f);
        for (int i = 0; i < 1000000; i++)
        {
            out.write("s");
        }
        out.flush();
        out.close();
    }
    
}
