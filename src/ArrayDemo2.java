import java.util.Scanner;

public class ArrayDemo2
{
    public static void main(String[] args) {

        int no[]=new int[5];
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        for (int index = 0; index < 5; index++)
        {
            System.out.println("Enter No:");
            no[index]=scanner.nextInt();
            sum=sum+no[index];
        }

        System.out.println("Sum :"+sum);


        int max=no[0];
        for (int index = 0; index < 5; index++) {

            if(no[index]>=max)
            {
                max=no[index];
            }
        }
        System.out.println("maximum:"+max);

    }
}
