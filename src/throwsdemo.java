import java.io.DataInputStream;
import java.io.IOException;

public class throwsdemo
{
    public static void main(String[] args) throws IOException
    {

            DataInputStream din = new DataInputStream(System.in);

            System.out.println("Enter Name:");
            String name = din.readLine();

            System.out.println("Name :" + name);



    }
}
