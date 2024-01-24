package model;

import java.util.ArrayList;
import java.util.Scanner;

public class DBDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        StudentDB studentDB=new StudentDB();

        int option=0;
        do
        {
            System.out.println("\t\t\t Student Info ");
            System.out.println("\t\t 1.Entry");
            System.out.println("\t\t 2.View ");
            System.out.println("\t\t 3.Exit ");

            System.out.println("Enter Your Option :");
            option=scanner.nextInt();

           switch (option)
           {
               case 1:
                      Student student=new Student();
                      System.out.println("Enter Student Id:");
                      student.setId(scanner.nextInt());
                      System.out.println("Enter Student Name:");
                      student.setName(scanner.next());
                      System.out.println("Enter Student Course :");
                      student.setCourse(scanner.next());
                      System.out.println("Enter Student Fees :");
                      student.setFees(scanner.nextInt());
                      if(studentDB.insert(student)){
                          System.out.println("record is inserted successfully");
                      }
                      else {
                          System.out.println("record is not inserted successfullly");
                      }
               break;
               case 2:
                   ArrayList<Student> studentlist=studentDB.view();
                   for (Student student2:studentlist)
                   {
                       System.out.println("Id :"+student2.getId());
                       System.out.println("Name :"+student2.getName());
                       System.out.println("Course :"+student2.getCourse());
                       System.out.println("Fees :"+student2.getFees());
                       System.out.println("============================================");
                   }
               break;
               case 3:
                   System.out.println("you are exited ");
                   break;
               default :
                   System.out.println("Wrong option selected try again !!");
                   break;


           }

        }while (option!=3);


    }
}
