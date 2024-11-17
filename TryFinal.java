
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TryFinal
{
    public static void main(String[] args) throws IOException {
        // BufferedReader br = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))   //Auto close the br object of BufferedReader   // try
        {                          
            // br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();
            System.out.println(name);
        }
        // finally
        // {
        //     br.close();
        // }

        try
        {
            throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong, "+e);
        }
        finally                             // this will run any way..
        {
            System.out.println("Bye Bye...");
        }
    }
}