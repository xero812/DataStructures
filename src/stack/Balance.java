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
public class Balance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            String s=sc.next();
            if(isBalanced(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    
    private static boolean isBalanced(String str) 
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            // is c a left bracket?
            if (c == '{' || c == '[' || c == '(') 
                stack.push(c);
            else 
            {
                // c is a right bracket
                if (stack.isEmpty()) 
                    return false;
                char left_bracket = stack.peek();
                if ((left_bracket == '{' && c == '}') ||
                        (left_bracket == '[' && c == ']') || 
                        (left_bracket == '(' && c == ')')) 
                {
                    stack.pop();
                } 
                else return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else return false;
    }
    
}
