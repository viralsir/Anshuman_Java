/*
     Constructor :- is a special function which is being called when the object of the same class is created.

     -> it is use to initialize the member variable
     -> constructor name and class name must be same
     -> it does not return any value (it does not have any return type )

     class Student
     {
        int no=23;

        // non parameterised constructor
        Student()
        {
        }

        // parameterised constructor
        Student(int n)
        {
           no=n;
        }

     }


     Student s1=new Student(45);

     System.out.println(s1.no);


    polymorphism :
                      constructor   overloading
                      function(method)   overloading

 */

class StudentInfo
{
    int rollno=1;
    String name="vimal";
    int discount=3;

    public StudentInfo() {
    }

    public StudentInfo(int discount) {
        this.discount = discount;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    void total(int no1,int no2)
    {
        System.out.println("total :"+(no1+no2));
    }

    void total(int no1,int no2,int no3)
    {
        System.out.println("total :"+ (no1+no2+no3));
    }


}


public class ConstructorDemo {


    public static void main(String[] args) {
            StudentInfo s1=new StudentInfo();
            StudentInfo s2=new StudentInfo(12);
//            s1.rollno=34;
//            System.out.println(s2.rollno);
//
            s1.setDiscount(45);

        System.out.println("Discount :" + s1.getDiscount());
        System.out.println("discount :" + s2.discount);

        s1.total(12,23);
        s1.total(12,23,33);


    }

}
