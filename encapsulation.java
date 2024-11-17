class Human
{
    private int age = 22;
    private String name = "Simran";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;             // this keyword use for current object varible
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class encapsulation
{
    public static void main(String args[])
    {
        Human obj1 = new Human();
        obj1.setAge(23);
        obj1.setName("Meera Sameer Pawar");

        System.err.println(obj1.getName());
        System.err.println(obj1.getAge()); 
    }
}