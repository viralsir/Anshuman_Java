package UnitTest;

import java.util.Scanner;

public class Product
{
    int id;
    String name;
    int qty;
    float rate;
    float price;

    void setProduct(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Product Id:");
        id=scanner.nextInt();
        System.out.println("Enter Product Name :");
        name=scanner.next();
        System.out.println("Enter Product Qty :");
        qty=scanner.nextInt();
        System.out.println("Enter Product Rate :");
        rate=scanner.nextFloat();

        price=qty*rate;

    }

    void getProduct(){

        System.out.println(id+"\t"+name+"\t"+qty+"\t"+rate+"\t"+price);
    }


}
