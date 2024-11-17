import java.util.*;

class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        // 1. Stream is only use once for any operation 
        // Stream<Integer> s1 = nums.stream();  
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);   // 4, 2, 6
        // Stream<Integer> s3 = s2.map(n -> n*2);         // 8, 4, 12
        // int result = s3.reduce(0, (c, e) -> c+e);      // 24

             // OR

        int result = nums.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0, (c,e) -> c+e); 
    
        // nums.forEach(n -> System.out.println(n));   
        System.out.println(result);  
    }
}