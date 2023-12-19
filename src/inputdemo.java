import java.util.Scanner;

public class inputdemo
{
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);

        System.out.print("Enter No:");
        int no1=s.nextInt();
        System.out.print("Enter No:");
        int no2=s.nextInt();
        System.out.println("Enter Name:");
        String name=s.next();


        System.out.println("no1:"+no1);
        System.out.println("no2:"+no2);
        System.out.println("Name :"+name);


    }
}
