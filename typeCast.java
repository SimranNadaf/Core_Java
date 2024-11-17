class typeCast 
{
    public static void main(String args[]){
        // byte b = 127;                          // Conversion or Implicite Casting
        // int a = b;
        // System.out.println(a);

        // int a = 12;                              // Explicite Casting or casting
        // byte b = (byte)a;
        // System.out.println(b);

        // int a = 257;                                
        // byte b = (byte) a;                         // a % 256(int size in bits) = 1
        // System.out.println(b);

        byte a = 10;
        byte b = 30;
        int result = a * b;                         // Type Promotion
        System.out.println(result);
    }
}