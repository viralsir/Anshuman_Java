import java.util.Scanner;
/*
       Array : is a shared name of multiple memmory block or location.

      int no;

      int no=new int[5];
                    index - 0
            no[0],no[1],--- ,no[4]    (0 to n-1)

      no=54;





 */

public class ArrayDemo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        //int rollno=0,maths=0,science=0,english=0;
        //String name="";

        int rollno[]=new int[5];
        int maths[]=new int[5];
        int science[]=new int[5];
        int english[]=new int[5];

        String name[]=new String[5];

        for (int i = 0; i < 2; i++)
        {
            System.out.println("Student - " + (i + 1));
            System.out.println("Enter Roll No:");
            rollno[i] = scanner.nextInt();
            System.out.println("Enter Name :");
             name[i] = scanner.next();
            System.out.println("Enter Maths marks:");
            maths[i] = scanner.nextInt();
            System.out.println("Enter Science Marks:");
            science[i] = scanner.nextInt();
            System.out.println("Enter English Marks:");
            english[i] = scanner.nextInt();
        }
        System.out.println("\n output :\n");

        for (int i = 0; i < 2; i++)
        {

            System.out.println("Roll No:"+rollno[i]);
            System.out.println("Name :"+name[i]);
            System.out.println("Maths Marks:"+maths[i]);
            System.out.println("Science marks:"+science[i]);
            System.out.println("English Marks:"+english[i]);

        }


    }
}
