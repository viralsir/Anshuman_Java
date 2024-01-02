import java.util.Arrays;
import java.util.Scanner;

public class Student_Two_di_Array_Demo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String title[]={"Maths","Science","English","Social Science"};

        final int PASSING_MARKS=35;

        int Rollno[]=new int[5];
        String name[]=new String[5];
        int marks[][]=new int[5][title.length];
        boolean is_Pass=true;

        for (int i = 0; i < 3; i++)
        {
            System.out.print("Enter Roll No:");
            Rollno[i]=scanner.nextInt();
            System.out.print("Enter Name :");
            name[i]=scanner.next();

            for (int j = 0; j < title.length; j++) {

                System.out.println("Enter "+title[j]);
                marks[i][j]=scanner.nextInt();
            }

        }

        System.out.println("\n output :\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Roll No:"+Rollno[i]);
            System.out.println("Name :"+name[i]);

            is_Pass=true;
            for (int j = 0; j < title.length; j++)
            {
                System.out.println(title[j]+":"+ marks[i][j]);
                if(marks[i][j]<PASSING_MARKS)
                {
                    is_Pass=false;
                }

            }
            System.out.println((is_Pass)?"you are pass":"you are fail");


//            if(is_Pass)
//            {
//                System.out.println("\n you are pass");
//            }
//            else
//            {
//                System.out.println("\n you are fail ");
//            }
            System.out.println("========================================================");
        }


    }
}
