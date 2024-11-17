
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Set_Interface {
    public static void main(String[] args) {
        // not support indexing, not support insertion sequence

        // Collection<Integer> nums = new TreeSet<>();
        Set<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(6);
        nums.add(3);
        System.out.println(nums);

        // using iterator interface
        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}