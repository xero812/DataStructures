package stack;


import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String infix=sc.nextLine();
        String postfix="";
        Stack<Character> stack=new Stack();
        for (int i = 0; i < infix.length(); i++)
        {
            Character ch=infix.charAt(i);
            if((int)ch>=65 && (int)ch<=90)
            {
                postfix+=ch;
            }
            else if(ch==')')
            {
                while(stack.peek()!='(')
                    postfix+=stack.pop();
                stack.pop();
            }
            else
            {
                while(true)
                {
                    if(stack.isEmpty() || stack.peek()=='(')
                    {
                        break;
                    }
                    else
                    {
                        postfix+=stack.pop();
                    }
                }
                stack.push(ch);
            }
            System.out.println(postfix);
            System.out.println(stack);
            System.out.println("************");
        }
        while (!stack.isEmpty())
        {
            postfix+=stack.pop();
        }
        
        System.out.println(postfix);
    }
    
}
