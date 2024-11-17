
class A
{
    public void abc()
        {
            try{
                // handle exception at time of function call, it throws a exception at space where method called
            b();
            c();
            }
            catch(Exception e){
                System.err.println("Exception Catched, "+e);
            }
            
        }
        public void b()throws Exception
        {
            throw new Exception();
        }
        public void c()throws Exception
        {
            throw new Exception();
        }
}

// User Defined Exception class
class SimranException extends Exception
{
    public SimranException(String str)
    {
        super(str);
    }
}

class ExceptionHandling
{
    public static void main(String[] args)  {       // throws ClassNotFoundException - when this at main, this will handle by JVM, JVM will stop the excution of program
        try
        {
        Class.forName("Method");            // here, handle checked exception: it is compalsary to handle exception
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class is not found : ");    
            e.printStackTrace();                // Printing all classes that are causing problem
        }

        int i = 21;
        int j = 0; 

        try
        {
            throw new SimranException("Simran Exception handling using custom exception");
        }
        catch(SimranException e)
        {
            System.out.println("Message: "+e);
        }

        // int arr[] = new int[5];
        // try
        // {
        //     j = 18 / i;             // Critical Statement - throws exception
        //     arr[1] = 12;            // Critical Statement - throws exception

        //     if(j == 0)
        //     {
        //         throw new ArithmeticException("set Defalut value to j");      
        //     }
        // }
        // catch(ArithmeticException e)
        // {
        //     j = 18 / 1;        // Default value to j
        //     System.err.println("Default value to j, Message: "+e);
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.err.println("Your are accessing element out of range");
        // }
        // catch(Exception e)          // catch exception
        // {
        //     System.err.println("Something went wrong, "+e);
        // }
        System.err.println(j);


        //throws Exception at time of call
        A obj = new A();
        obj.abc();
        System.out.println("End of Program, Bye...");
    }
}