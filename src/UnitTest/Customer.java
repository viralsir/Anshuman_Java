package UnitTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends  Personal
{
    int billno;
    String billDate;
    float totalamount,gst,discount,netamount;

    ArrayList<Product> products=new ArrayList<Product>();

    void setCustomer()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter bill No:");
        billno=scanner.nextInt();
        System.out.println("Enter Bill Date :");
        billDate=scanner.next();

        setPersonal("Customer");
        String option="y";
        do
        {
            Product product=new Product();
            product.setProduct();

            products.add(product);
            totalamount = totalamount + product.price;
            System.out.println("Do you want to Add Product (y/n)?:");
            option=scanner.next();

        }while(option.equalsIgnoreCase("y"));

        System.out.println("Enter Discount (%):");
        discount=scanner.nextFloat();
        discount=(discount*totalamount)/100;
        System.out.println("Enter Tax (%):");
        gst=scanner.nextFloat();
        gst=(gst*totalamount)/100;

        netamount=totalamount+gst-discount;
    }

    void getCustomer()
    {

        System.out.println("Bill No:"+billno);
        System.out.println("Bill Date:"+billDate);

        getPersonal("Customer");

        System.out.println("\n ID \t Name \t Qty \t Rate \t Price ");
        System.out.println("========================================================================");
        for (Product product:products)
        {
            product.getProduct();
        }
        System.out.println("Total Amount :"+totalamount);
        System.out.println("Discount :"+discount);
        System.out.println("GST :"+gst);
        System.out.println("Net Amount :"+netamount);

    }
}
