import java.util.Scanner;

public class ForEachDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int no[]=new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter No:");
            no[i]=scanner.nextInt();

        }

        for (int value:no){
            System.out.println(value);
        }


    }
}
