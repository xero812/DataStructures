/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

/**
 *
 * @author Adesh Srivastava
 */
public class Check
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File f=new File("C:\\Users\\Adesh Srivastava\\Desktop\\abc.txt");
        FileWriter fos=new FileWriter(f);
        //OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter out=new BufferedWriter(fos);
        int i=1;
        //while(i<=100)
        //{
            out.write(i);
        //    i++;
        //}
            out.close();
    }
    
}
