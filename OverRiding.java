class A
{
    public int add(int a, int b)
    {
        return a+b;
    }
}
class B extends A
{
    public int add(int a, int b){       // first priority to own class than parent class
        return a+b+1;
    }
}
class OverRiding
{
    public static void main(String[] args) {
     B obj = new B();
     int r1 = obj.add(2, 8);
     System.err.println(r1);   
    }
}