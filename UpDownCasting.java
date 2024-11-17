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

class UpDownCasting
{
    public static void main(String[] args) {
        A obj = new B();                        // UpCasting
        
        B obj1 = (B) obj;                       // A to B : DownCasting
        obj.show();
        obj1.show();
    }
}