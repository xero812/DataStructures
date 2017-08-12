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
public class FileWr
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("C:\\Users\\Adesh Srivastava\\Desktop\\test.txt");
        FileWriter wr=new FileWriter(f);
        wr.write("grgrgg");
        wr.flush();
        wr.close();
    }    
}



