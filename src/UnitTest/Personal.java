package UnitTest;

import java.util.Scanner;

public class Personal {

    int id;
    String name;
    String Address;
    String phno;

     void setPersonal(String title)
     {
         Scanner scanner=new Scanner(System.in);

         System.out.println("Enter "+title+" id:");
         id=scanner.nextInt();
         System.out.println("Enter "+title+" Name :");
         name=scanner.next();
         System.out.println("Enter "+title+" Address:");
         Address=scanner.next();
         System.out.println("Enter "+title+" Phno:");
         phno=scanner.next();


     }

     void getPersonal(String title)
     {
         System.out.println(title +" Id:"+id);
         System.out.println(title+" Name:"+name);
         System.out.println(title+" Address:"+Address);
         System.out.println(title+" Phno:"+phno);
     }


}
