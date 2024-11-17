abstract  class Car                 // abstract class may or may not have abstract methods
{
    public abstract void drive();   // abstract method declared in only abstract class
    public abstract void fly();
    public void playMusic()
    {
        System.err.println("Play Music...");
    }
}

abstract class Maruthi extends Car    // if we wanted to implement only few abstract methods - made this class to abstract
{
    public void drive()
    {
        System.err.println("Driving...");
    }
}

class UpdatedMaruthi extends Maruthi     // implement abstract method from car in this class otherwise this class will be abtarct
{
    public void fly()
    {
        System.err.println("Fly...");
    }
}

class AbstractKey
{
    public static void main(String[] args) {
        // Maruthi m = new Maruthi();              // can't create obj of abstract class
        UpdatedMaruthi m = new UpdatedMaruthi();
        m.fly();
        m.drive();
        m.playMusic();
    }
}