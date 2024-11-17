class A 
{
    public A()
    {
        super();        // by defualt super( ) in every constructor
        System.err.println("Inside of A()");
    }
    public A(int n)
    {
        System.err.println("Inside of A(int)");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.err.println("Inside of B()");
    }

    public B(int n)
    {
        // super(n);                   // by defual super(), chnaged to super(n): call super constructor with int parameter
        this();                     // this will call current class constructor 
        System.err.println("Inside of B(int)");
    }
}

class ThisSuper{
    public static void main(String args[])
    {
        B obj = new B(5);
    }
}