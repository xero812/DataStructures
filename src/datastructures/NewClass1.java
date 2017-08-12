package datastructures;
class A
{
    A()
    {
        this(5);
        System.out.println("Default of A");
    }
    A(int a)
    {
        System.out.println("Param of A");
        
    }
}
class B extends A
{
    B()
    {
        super();
        System.out.println("Default of B");
        
    }
    B(int a)
    {
        System.out.println("Param of B");
        
    }
}
class Main
{
    public static void main(String[] args)
    {
        B a=new B();
    }
}