import java.util.Scanner;

/*

1. Employee (min 5 field )
2. Train/ Air Reservation
3. Movie Ticket booking
4. Doctor Appointment
5. Vehicle Registration




        Premetive data type  :  int ,char ,float ,double

           Derived Data type :    array, ArrayList

        Abstract Data type : class

            class : is a  bunch of related data .
                              or
                    is a  blueprint for object.

                  class Student
                  {
                     // member variable
                         int no;
                         String name;
                         int maths;
                         int science;
                         int english ;

                   }

            new Student(); ( no=1 , name=vimal ,maths=23,science=34,english=45 )

            Student s1=new Student(); (no=1,name="viren",maths=34,science=45,english=56)

            object : is a unique medium to access or get the properties of ref. class

            ref variable : is medium to access object.




 */
class Product
{
    int id;
    String name;
    int qty;
    float rate;
    float price;

}
public class ProductDemo
{
    //int id;

    public static void main(String[] args)
    {
        //Product product1=new Product();
       // Product product2=new Product();

        Product productArray[]=new Product[3];




        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            productArray[i]=new Product();
            System.out.println("Enter Product Id:");
            productArray[i].id=scanner.nextInt();
            System.out.println("Enter Product Name:");
            productArray[i].name=scanner.next();
            System.out.println("Enter Product Qty :");
            productArray[i].qty=scanner.nextInt();
            System.out.println("Enter Product Rate :");
            productArray[i].rate=scanner.nextFloat();

            productArray[i].price= productArray[i].qty* productArray[i].rate;


        }

        for (Product product1:productArray)
        {
            System.out.println("Product Id :"+product1.id);
            System.out.println("Product name :"+product1.name);
            System.out.println("Product Qty :"+product1.qty);
            System.out.println("Product Rate:"+product1.rate);
            System.out.println("Product Price :"+product1.price);

        }






//        ProductDemo pr1=new ProductDemo();
//        ProductDemo pr2=new ProductDemo();
//        ProductDemo pr3=pr1;
//        ProductDemo pr4=pr2;
//
//       // new ProductDemo().id=23;
//        pr1.id=34;
//        pr1=pr2;
//        pr1.id=45;
//
//        System.out.println(pr4.id);



    }

}
