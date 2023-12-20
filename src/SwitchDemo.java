import java.util.Scanner;

/*
    switch
            switch(variable)
            {
                 case  value:
                          true part;
                          statement;
                 break;
                 case  value:
                          true part;
                          statement;
                  break;
                  -----------------
                  --------------
                  default :
                          statement
                          false part;
                  break;
                 }
 */
public class SwitchDemo {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter No1:");
        int no1=s.nextInt();
        System.out.println("Enter No2:");
        int no2=s.nextInt();

        System.out.println("\t\t\t Calcuator ");
        System.out.println("\t\t press 1 for Addition");
        System.out.println("\t\t press 2 for Subtraction");
        System.out.println("\t\t press 3 for Multiplication");
        System.out.println("\t\t press 4 for Division");

        System.out.println("Enter Your option :");
        int option=s.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Addition :"+ (no1+no2));
                break;

            case 2:
                System.out.println("Substraction :"+(no1-no2));
                break;
            case 3:
                System.out.println("Multiplication :"+(no1*no2));
                break;
            case 4:
                System.out.println("Division :"+(no1/no2));
                break;
            default:
                System.out.println("Wrong option selected ");
                break;
        }



    }
}
