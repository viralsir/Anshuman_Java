import java.util.ArrayList;
import java.util.Scanner;

class Student
{

    int rollno;
    String name;
    int maths;
    int science;
    int english;


    void setStudent()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Student Roll No:");
        rollno= scanner.nextInt();
        System.out.println("Enter Student Name :");
        name=scanner.next();
        System.out.println("Enter Student Maths Marks:");
        maths=scanner.nextInt();
        System.out.println("Enter Student Science Marks:");
        science=scanner.nextInt();
        System.out.println("Enter Student English Marks:");
        english=scanner.nextInt();


    }

    void getStudent()
    {
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);
        System.out.println("English :"+english);
    }

    boolean isPass()
    {
        if(maths>=35 && science>=35 && english>=35)
        {
            return true;
        }
        else {
            return false;
        }
    }

}

public class Student_OOP_Demo {

    public static void main(String[] args) {

             Scanner scanner=new Scanner(System.in);

             //Student students[]=new Student[5];
            ArrayList  <Student>Students=new ArrayList<Student>();
             int option=0,index=0;
             do
             {
                 System.out.println("\t\t\t Student Info ");
                 System.out.println("\t\t\t press 1 for Entry");
                 System.out.println("\t\t\t press 2 for View ");
                 System.out.println("\t\t\t press 3 for Exit");

                 System.out.print("\t Enter your option :");
                 option=scanner.nextInt();


                 switch (option)
                 {
                     case 1:
                             String option2="y";
                             do
                             {
                                 System.out.println("\t\t Entry ");
                                 Student s1=new Student();
                                 s1.setStudent();
                                 Students.add(s1);
                                 System.out.println("do you want to continue (Y/N)?:");
                                 option2= scanner.next();

                             }while(option2.equalsIgnoreCase("Y"));
                     break;
                     case 2:
                         System.out.println("\t\t\t View \n");
                         for (Student s1:Students)
                         {
                                        s1.getStudent();
                                        if(s1.isPass())
                                        {
                                            System.out.println("You are Pass");
                                        }
                                        else{
                                            System.out.println("You are Fail");
                                        }
                             System.out.println("===================================================================");
                         }
                         break;

                     case 3:
                         System.out.println("you are exited");
                         break;
                     default:
                         System.out.println("Wrong option Selected try Again !!");
                     break;
                 }


             }while (option !=3);



    }
}
