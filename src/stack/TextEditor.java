/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author Adesh Srivastava
 */
public class TextEditor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        Stack<Integer> choiceStack=new Stack<>();
        Stack<String> dataStack=new Stack<>();
        for (int i = 0; i < n; i++)
        {
            int ch=sc.nextInt();
            switch(ch)
            {
                
                case 1:
                    String w=sc.next();
                    choiceStack.push(1);
                    dataStack.push(""+w.length());
                    s=s+w;
                    break;
                    
                    
                case 2:
                    int k=sc.nextInt();
                    choiceStack.push(2);
                    dataStack.push(s.substring(s.length()-k));
                    s=s.substring(0,s.length()-k);
                    break;
                    
                    
                case 3:
                    k=sc.nextInt();
                    System.out.println(s.charAt(k-1));
                    break;
                    
                    
                case 4:
                    int u=choiceStack.pop();
                    if(u==1)
                    {
                        s=s.substring(0,s.length()-Integer.parseInt(dataStack.pop()));
                    
                    }
                    else if(u==2)
                    {
                        s=s+dataStack.pop();
                    }
                    break;
                    
            }
        }
    }
    
}
