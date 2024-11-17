class Student 
{
    String name;
    int marks;
}
class array 
{
    public static void main(String args[]){
        // int nums[] = new int[4];                 // array declaration - it store in heap - it is an object
        // nums[0] = 1;                             // array initialization
        // nums[1] = 2;
        // nums[2] = 3;
        // nums[3] = 4;

        // int nums[][] = new int[3][4];

        // int nums[][] = new int[3][];
        // nums[0] = new int[4];           // different size of each nested array
        // nums[1] = new int[5];
        // nums[2] = new int[6];

        Student s1 = new Student();
        s1.name = "Simran";
        s1.marks = 98;

        Student s2 = new Student();
        s2.name = "Mitu";
        s2.marks = 95;

        Student s3 = new Student();
        s3.name = "Sameer";
        s3.marks = 92;

        // Array of Student objects
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        // students[2] = s3;            // way 1
        students[2] = new Student();        // way 2
        students[2].name = "Guddu";
        students[2].marks = 36;

        for(Student s:students){
            System.out.println(s.name+" : "+s.marks);
        }

        //  for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 10);             // random return double, in range 0 to 1
        //     }
        // }

        // Enhanced For Loop - multiple dimension array
        // for(int num[]:nums){
        //     for(int n:num){
        //         System.out.print(n+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        // for(int n:nums){                // Enhanced For Loop
        //     System.out.println(n);
        // }
    }
}