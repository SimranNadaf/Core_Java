class Mobile
{
    String brand;
    int price;
    static String name;

    Mobile(){
        brand = "";
        price = 200;
    }

    static                  //static block : called only once at class load - when first obj is created
    {
        name = "smartphone";
        System.out.println("In side a static block");
    }

    public void show(){
        System.out.println("Brand : " +brand+", Price : "+price+", Name : "+name );
    }

    // public static void show1(){             // static method access only static function
    //     System.out.println("Name : "+name );
    // }

    // to access non-static variable in static method - pass obj of that class as parameter
    public static void show1(Mobile obj)
    {
        System.out.println("Brand : " +obj.brand+", Price : "+obj.price+", Name : "+name );   
    } 
}
class staticAll 
{
    public static void main(String args[]) throws ClassNotFoundException{
        // loading class loader without creation of object of class
        Class.forName("Mobile");            // required exception handling 

        // Mobile obj1 = new Mobile();
        // obj1.brand = "iPhone";
        // obj1.price = 1500;

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Sumsung";
        // obj2.price = 1700;

        // Mobile.name = "SmartPhone";         // Static variable accessment
        
        // obj1.show();
        // obj2.show();

        // calling static method
        // Mobile.show1();
        // Mobile.show1(obj1);
    }
}