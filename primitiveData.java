class primitiveData 
{

    public static void main(String a[])
    {   // laterals                       output
        // int num1 = 10_00_00_00;        10000000
        // int num1 = 0b101;                 5
        // int num1 = 0xa;                  10
        System.out.println(num1);
        int num = 1000;   // 4 byte
        byte by = 127;    // 1 byte
        short s = 558;    // 2 byte
        long l = 5567890; // 8 byte

        float f = 5.6f;  // 4 byte
        double d = 5.6; // defualt datatype for pointer number like 4.5 , 8.99 - 8 byte

        char c = 'a';   // 2 byte - only single quote for char - it unicode, not ascii code, it can use for all symbols

        boolean b = true; // 1 byte - true or false - not 0 or 1
    }

}