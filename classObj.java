class calculation
{
    int num1 = 10;
    int add(int a, int b)
    {
        return a + b;
    }
    int add(int a, int b, int c){          // Function overloading - same function name with different parameters types or count
        return (a+b+c);
    }
    double add(double a, double b){
        return a + b;
    }
}

class classObj 
{
    
    public static void main(String args[]){
        calculation obj = new calculation();
        int result = obj.add(10,22,31);
        System.out.println("adding is "+result);
    }
}