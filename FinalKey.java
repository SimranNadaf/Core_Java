class A           // final class A
{
    final void show(){              // final method
        System.err.println("show in A");
    }
}
class B extends A          //class B extends A - final class can't be inherite
{
    // void show(){                             // final method can't be overriding
    //     System.err.println("show in B");
    // }
}
class FinalKey
{
    public static void main(String[] args) {
        final double PI = 3.17;     // Constant
        // PI = 3.90;       // not allow to reassign
    }
}