
import java.util.*;

// class Student {
//     int age;
//     String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

// }

class Student implements Comparable<Student>{  // implements Comparable interface and override compareTo()
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        return -1;
    }
}

class Collections_class {

    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() {  // --> FunctionalInterface
        //     public int compare(Integer i, Integer j) {
        //         if(i%10 > j%10) {
        //             return 1;
        //         }
        //         return -1;
        //     }
        // };

          // used Lambda exp
        Comparator<Integer> com = (i, j) -> {     // used obj in sort() for add logic for sorting       
                if(i%10 > j%10) {
                    return 1;
                }
                return -1;
        };

        // Comparator<Student> stuSort = (s1, s2) -> {     // used obj in sort() for add logic for sorting       
        //         if(s1.age > s2.age) {
        //             return 1;
        //         }
        //         return -1;
        // };

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(80);
        nums.add(39);
        nums.add(93);
        nums.add(24);
        nums.add(43);
        // Collections.sort(nums); // by defualt sort ascending order
        Collections.sort(nums,com); // added obj of Comparator interface inside compare(i, j) with logic
        System.out.println(nums);


        ArrayList<Student> studs = new ArrayList<>();
        studs.add(new Student(12,"Simran"));
        studs.add(new Student(22,"Ram"));
        studs.add(new Student(28,"Sameer"));
        studs.add(new Student(17,"Meera"));
        studs.add(new Student(16,"Rahul"));

        // Collections.sort(studs,stuSort);   // --> using Comparator interface
        Collections.sort(studs);                // --> using Comrable Interface that implements in Student class
        for(Student s: studs) {
            System.out.println("Age: "+s.age+" Name: "+s.name);
        }
    }    
}