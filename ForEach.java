import java.util.*;
import java.util.function.Consumer;

class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        // forEach loop get Consumer object
        // Consumer<Integer> con = new Consumer<Integer>() {   // --> Consumer interface is FunctionalInterface
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        // using Lambda Expression
        Consumer<Integer> con = n -> System.out.println(n);

        // nums.forEach(n->System.out.println(n));       // forEach loop
        nums.forEach(con);       // forEach loop using Consumer Object
    }
}