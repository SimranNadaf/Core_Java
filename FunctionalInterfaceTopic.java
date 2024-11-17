@FunctionalInterface
interface A
{
    // void show();
    int add(int i, int j);
}

class FunctionalInterfaceTopic
{
    public static void main(String args[])
    {
        // A obj = new A()                      // Anonymouse method implementation
        //     {
        //         public void show()
        //         {                            
        //         System.err.println("Showing....");
        //         }
        //     };

        // A obj = () -> {                             // Lambda method used in "Anonymouse method implementation"
        //         System.err.println("Showing....");
        //     };

        // A obj = () ->  System.err.println("Showing....");

        // A obj = new A()
        // {
        //     public int add(int i, int j)
        //     {
        //         return i+j;
        //     }
        // };

        //  A obj =(int i, int j) ->
        //     {
        //         return i+j;
        //     };

         A obj = (i, j) -> i+j;                 // Anonymouse method impl. using Lambda method taking i and j and return i+j

        int result = obj.add(3, 12); 
        System.out.println(result);   
    }
}