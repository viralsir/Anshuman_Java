package UnitTest;

import java.util.ArrayList;
import java.util.Scanner;

public class AnshuPlaza
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Vendor> vendors=new ArrayList<Vendor>();
        ArrayList<Customer> customers=new ArrayList<Customer>();
        int option1=0,option2=0;

        do
        {
            System.out.println("\n\t\t\t Anshu Plaza \n");
            System.out.println("==================================================================");

            System.out.println("\t\t 1.Purchase");
            System.out.println("\t\t 2.Sales");
            System.out.println("\t\t 3.Exit");

            System.out.println("\t Enter your option :");
            option1=scanner.nextInt();

            switch(option1)
            {
                case 1:

                        do
                        {
                            System.out.println("\n\t\t\t Purchase ");
                            System.out.println("\t\t 1.Entry");
                            System.out.println("\t\t 2.View");
                            System.out.println("\t\t 3.Exit");

                            System.out.println("Enter your option :");
                            option2=scanner.nextInt();

                            switch (option2)
                            {
                                case 1:
                                       String option3="y";
                                       do
                                       {
                                             System.out.println("\t\t\t Entry ");
                                             Vendor vendor=new Vendor();
                                             vendor.setVendor();
                                             vendors.add(vendor);
                                             System.out.println("do you want to continue (y/n)?:");
                                             option3=scanner.next();
                                       }while (option3.equalsIgnoreCase("y"));
                                break;
                                case 2:
                                    System.out.println("\n\t\t\t View ");
                                    for (Vendor vendor:vendors)
                                    {
                                            vendor.getVendor();
                                        System.out.println("-------------------------------------------------");
                                    }
                                break;
                                case 3:
                                    System.out.println("Back to Main Menu");
                                    break;
                                default:
                                    System.out.println("\n Wrong option Selected Try again !!!!");
                                break;

                            }

                        }while (option2!=3);
                break;
                case 2:
                    do
                    {
                        System.out.println("\n\t\t\t Sales ");
                        System.out.println("\t\t 1.Entry");
                        System.out.println("\t\t 2.View");
                        System.out.println("\t\t 3.Exit");

                        System.out.println("Enter your option :");
                        option2=scanner.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="y";
                                do
                                {
                                    System.out.println("\t\t\t Entry ");
                                    Customer customer=new Customer();
                                    customer.setCustomer();
                                    customers.add(customer);
                                    System.out.println("do you want to continue (y/n)?:");
                                    option3=scanner.next();
                                }while (option3.equalsIgnoreCase("y"));
                                break;
                            case 2:
                                System.out.println("\n\t\t\t View ");
                                for (Customer customer:customers)
                                {
                                    customer.getCustomer();
                                    System.out.println("-------------------------------------------------");
                                }
                                break;
                            case 3:
                                System.out.println("Back to Main Menu");
                                break;
                            default:
                                System.out.println("\n Wrong option Selected Try again !!!!");
                                break;

                        }

                    }while (option2!=3);
                    break;
                case 3:
                    System.out.println("\n You are exited ");
                break;
                default:
                    System.out.println("\n Wrong option selected try Again !!!");
                break;

            }

        }while(option1!=3);





    }
}
