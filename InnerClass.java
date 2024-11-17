class A                     // static keyword can't be use for outter class
{
    public int num = 10;
    static class B      // inner static class
    {
        public int numB = 20;
    }
}
class InnerClass
{
    public static void main(String[] args) {
        // A obj = new A();
        // A.B obj1 = obj.new B();             // creating a inner class object of non-static class.
        A.B obj1 = new A.B();                   // creating a inner static-class object.
        System.out.println(obj1.numB);
    }
}