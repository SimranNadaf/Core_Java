
import java.util.Objects;

class A extends Object
{
    String brand;
    int price;

    //overriding toString method - Object class
    // public String toString()
    // {
    //     return brand+" : "+price;
    // }

    // //overriding equals method - Object class
    // public Boolean equals(A that)
    // {
    //     return (this.brand == that.brand && this.price == that.price);
    // }

    // IDE generated toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A{");
        sb.append("brand=").append(brand);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    // IDE generated hasCode method
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.brand);
        hash = 29 * hash + this.price;
        return hash;
    }

    // IDE generated equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final A other = (A) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.brand, other.brand);
    }

    
}
class ObjectClass
{
    public static void main(String[] args) {
        A obj = new A();
        obj.brand = "iPhone";
        obj.price = 1500;

        A obj1 =  new A();
        obj1.brand = "iPhone";
        obj1.price = 1500;
        System.err.println(obj.toString());
        System.err.println(obj.equals(obj1));
    }
}