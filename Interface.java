

// class - class : extends
// class - interface : implemented
// interface - interface : extends

interface A                                //abstract class A - if all methods are abstract use interface
{
    int a = 10;           // interface varibles are final and static
    void show();                // no need to use abstract keyword at method //abstract void show();
}

interface AA
{
    void config();                            //abstract void config();
}

interface B extends A,AA           // interface B inherite to interface A and AA - multiple inheritance is implemented using interface
{
    void display();
}

class C implements B          // class C implements B, AA - - multiple inheritance is implemented using interface        
{
    public void show(){
        System.err.println("Show in C");
    }
    public void config(){
        System.err.println("config in C");
    }
    public void display(){
        System.err.println("Display in C");
    }
}

class Interface
{
    public static void main(String[] args) {
        // A obj = new A();         // inteface is abtract it can't create an object
        C obj = new C();
        obj.config();
        obj.display();
        obj.show();
        // obj.a = 20; -- Error: cannot assign a value to static final variable(interface variable)
        System.err.println(obj.a);      // interface variable
    }
} 