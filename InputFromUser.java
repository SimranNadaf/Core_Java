
import java.io.IOException;
import java.util.Scanner;

class InputFromUser
{
    public static void main(String[] args) throws IOException {
        //way 1:
        // int num = System.in.read();         // Read only 1 char and get only ASCII value
        // System.out.println(num - 48);      // ASCII value of 0(zero) is 48
        
        //way 2:
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);
        // int num = Integer.parseInt(br.readLine());         // Read line as String
        // System.out.println(num);

        //way 3:
        Scanner s = new Scanner(System.in);     // Simplier way
        int num = s.nextInt();                  // get int
        System.out.println(num);
    }
}