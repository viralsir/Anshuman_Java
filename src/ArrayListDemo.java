import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo
{
    public static void main(String[] args)
    {

        ArrayList <Integer>rollno_list=new ArrayList<Integer>();
        ArrayList <String>name_list=new ArrayList<String>();

        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Roll No:");
            rollno_list.add(scanner.nextInt());
            System.out.println("Enter Name:");
            name_list.add(scanner.next());


        }

        System.out.println("\n output :\n");
        for (int i = 0; i < 2; i++) {
            System.out.println("Roll No:"+rollno_list.get(i));
            System.out.println("Name :"+name_list.get(i));
        }

    }
}
