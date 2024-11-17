enum Status
{
    Running, Failing, Pending, Success;
}

enum Laptop
{
    Dell(1900), HP(1500), Asus(1700), Macbook(2000);

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    // get price
    public int getPrice(){
        return price;
    }

    //set price
    public void setPrice(int p){
        price = p;
    }
}

class EnumClass
{
    public static void main(String[] args) {
        Status s = Status.Pending;       
        // System.err.println(s);               // print single enum value
        
        // // To print - all values
        // Status ss[] = Status.values();   // OR // Status[] ss = Status.values();
        // for(Status s: ss)
        // {
        //     System.out.println(s);
        // }

        // switch for Enum
        // switch (s) {
        //     case Status.Pending:
        //         System.out.println("Please Wait...");
        //         break;
        //     case Status.Running:
        //         System.out.println("On the way...");
        //         break;
        //     case Status.Failing:
        //         System.out.println("Ohho, Try Again!");
        //         break;
        //     default:
        //         System.out.println("Successfully Completed!!!");
        // }

        Laptop lap = Laptop.Dell;
        System.out.println(lap.getPrice());             // getting price of enum value

        Laptop[] lapAll = Laptop.values();
        for(Laptop l: lapAll)
        {
            System.out.println(l+" : "+l.getPrice());
        }
    }
}