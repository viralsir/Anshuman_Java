/*
     Inheritance : is the proccess by which object of one class can Access or get the properties of object
     of another class.


     Class A
     {
         int noA;
       }

       class B (sub class,child class,derived class)  extends A (super class,parent class , base class)
       {
           int noB;
          }

          A a1=new A();
             a1.noA;


          B  b1=new B();
             b1.noB;
             b1.noA;


             Category of Inheritance

             1)Single Inheritance : one object access or get the properties of only one object at a time.

                A
                |
                B

            2)Multilevel Inheritance : continous Chain of Single Inheritance

               A
               |
               B
               |
               C

            3)Hyrarchical Inheritance : more than one object can access or get the properties of same object.

                            A
                      |              |
                      B              C


            4) Multiple Inheritance  : one object can access or get the properties of same object.

                                A            B
                                       |
                                       C
                    In java one object can't access the more than one object properties at a time.
                    not supported.

           5)  Hybrid Ineritance :-   combination of more than one inheritance .

                                    A
                                    |
                                    B
                                    |
                                    C
                             |            |
                             D             E



 */

import java.util.Scanner;

class Personal_Info
{
    int id;
    String name;
    String address;

    void setPersonal_Info()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Id :");
        id=scanner.nextInt();
        System.out.println("Enter Name :");
        name=scanner.next();
        System.out.println("Enter Address:");
        address= scanner.next();


    }

    void getPersonal_Info()
    {
        System.out.println("ID:"+id);
        System.out.println("Name :"+name);
        System.out.println("Address:"+address);
    }


}

class Employee extends Personal_Info
{
    int salary;

    void setSalary()
    {
        // setPersonal_Info();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Salary :");
        salary=scanner.nextInt();
    }

    void getSalary()
    {
        System.out.println("Salary :"+salary);
    }


}


class Customer extends  Personal_Info
{
    int billAmount;

    void setCustomer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Bill Amount :");
        billAmount=scanner.nextInt();

    }

    void getCustomer()
    {
        System.out.println("Bill Amount :"+billAmount);
    }

}



class Dmart extends Employee
{
    String location;

    void setDmart()
    {
           Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Location :");
        location= scanner.next();
    }
    void getDmart(){
        System.out.println("Location :"+location);

    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

//          Employee employee=new Employee();
//          employee.setPersonal_Info();
//          employee.setSalary();
//
//          employee.getPersonal_Info();
//          employee.getSalary();
//

//            Dmart dmart=new Dmart();
//            dmart.setPersonal_Info();
//            dmart.setSalary();
//            dmart.setDmart();
//
//            dmart.getPersonal_Info();
//            dmart.getSalary();
//            dmart.getDmart();
//

        Employee employee=new Employee();
        employee.setPersonal_Info();
        employee.setSalary();

        Customer customer=new Customer();
        customer.setPersonal_Info();
        customer.setCustomer();

        employee.getPersonal_Info();
        employee.getSalary();

        customer.getPersonal_Info();
        customer.getCustomer();


    }

}
