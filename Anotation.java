
// @Deprecated    //tells that can use, but not recommented, there is another better way
class A
{
    public void letsPrintAnyObjectThatWillDerived()
    {
        System.out.println("A class");
    }
}

class B extends A
{
    @Override      // Ensure that we are overriding
    public void letsPrintAnyObjectThatWillDerived()
    {
        System.err.println("B Class");
    }
}
class Anotation
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.letsPrintAnyObjectThatWillDerived();
    }
}