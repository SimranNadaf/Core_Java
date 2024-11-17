class string 
{
    public static void main(String args[])
    {
        // String name = new String("simran"); // store in heap: in string constant stack
        // String name = "simran";         // Mutable String
        // name = name + " nadaf";
        // System.out.println(name);

        StringBuffer name = new StringBuffer("Simran");
        // name.insert(6, " Nadaf");
        // name.deleteCharAt(0);
        System.out.println(name.capacity());        // Default - 16 length for empty string + length of str
        System.out.println(name);
    }
}