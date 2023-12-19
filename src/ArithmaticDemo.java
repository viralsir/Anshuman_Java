import java.util.Arrays;
import java.util.Scanner;

public class ArithmaticDemo
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter No1:");
        int no1= scanner.nextInt();
        System.out.println("Enter No2:");
        int no2=scanner.nextInt();

        float total=no1+no2;

        System.out.println("Total :"+total);
        System.out.println("avg :"+ total/2);
        System.out.println("substraction :"+ (no1-no2));
        System.out.println("multiplication :"+no1*no2);
        System.out.println("division :"+no1/no2);
        System.out.println("modulo :"+ no1%no2);


    }
}
