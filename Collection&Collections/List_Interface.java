import java.util.ArrayList;
import java.util.List;

class List_Interface {
    public static void main(String[] args) {
        // Collection nums = new ArrayList();

        // set type to value of collection
        // Collection<Integer> nums = new ArrayList<Integer>();  // int is primitive type, Collection only accept Class as Type
        
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(7);

        System.out.println(nums.indexOf(7));
        System.out.println(nums.get(0));

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        // System.out.println(nums[0]);    // --> no indexing for collection API
        System.out.println(nums);


    }
}