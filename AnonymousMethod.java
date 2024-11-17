abstract class A
{
    public abstract void show();
}
// using inheritance
// class B extends A
// {
//     public void show()
//     {
//         System.out.println("Show in B");
//     }
// }
class AnonymousMethod
{
    public static void main(String args[])
    {
        A obj = new A()                 // Anonymous Method
        {
            public void show()
            {
                System.out.println("Show Method");
            }
        };
        obj.show();
    }
}