// Note: in java, multiple inheritance is work, it get ambiguity problem: child class confuse, which parent class method
// is use. java don't support multiple inheritance

class Cal
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
}
class AvdCal extends Cal                // Single level inheritance
{
    public int mul(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }
}
class VeryAvdCal extends AvdCal         // Multilevel inheritance
{
    public double power(int n1, int n2)
    {
        return Math.pow(n2, n2);
    }
}

class Inheritance
{
    public static void main(String[] args) {
        VeryAvdCal c = new VeryAvdCal();
        int r1 = c.add(2,3);
        int r2 = c.sub(6,9);
        int r3 = c.mul(5,5);
        int r4 = c.div(15,8);
        double r5 = c.power(3, 3);
        System.err.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}