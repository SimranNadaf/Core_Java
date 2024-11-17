// Types: 1. Compile time polymorphism(overLoading), 2. run time polymorphism(overriding)

// Dynamic method dispatch - overriding.

class A
{
    public void show()
    {
        System.err.println("Show in A");
    }
}
class B extends A
{
    public void show()
    {
        System.err.println("Show in B");
    }
}

class Polymorphism
{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}