import java.util.Scanner;

public class TwoDiArrayDemo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int no[][]=new int[5][2];

        for (int row = 0; row < 5; row++) {

            for (int col = 0; col < 2; col++) {
                System.out.println("Enter No:");
                no[row][col]=scanner.nextInt();

            }

        }

        System.out.println("\n output :\n");

        for (int row = 0; row < 5; row++) {

            for (int col = 0; col < 2; col++) {
                System.out.print(no[row][col]);

            }
            System.out.println("");
        }



    }
}
