
import java.util.*;

class Map_Interface {
    public static void main(String[] args) {
        Map<String, Integer> nums = new HashMap<>();
        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("three", 3);
        nums.put("four", 4);

        System.out.println(nums.get("one"));    // get percular value 
        System.out.println(nums.keySet());      // get all keys
        System.out.println(nums.values());      // get all values
        System.out.println(nums);

    }
}