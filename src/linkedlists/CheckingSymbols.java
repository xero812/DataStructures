package linkedlists;


import java.util.Scanner;
import java.util.Stack;

public class CheckingSymbols
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack();
        if(s.length()==0 || s==null)
        {
            System.out.println("True");
            System.exit(0);
        }
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)==')')
            {
                if(!stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
                else
                {
                    System.out.println("False");
                    System.exit(0);
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(!stack.isEmpty() && stack.peek()=='{')
                    stack.pop();
                else
                {
                    System.out.println("False");
                    System.exit(0);
                }
            }
            else if(s.charAt(i)==']')
            {
                if(!stack.isEmpty() && stack.peek()=='[')
                    stack.pop();
                else
                {
                    System.out.println("False");
                    System.exit(0);
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())
            System.out.println("True");
        else
            System.out.println("False");
    }
    
}
