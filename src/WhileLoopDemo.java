/*
        circular control structure
        loop :-
             1)while
             2)do while
             3)for
             4) for each

               1)while loop :
                         syntax :
                                 intialization of variable
                                 while(condition)
                                 {
                                     statement;
                                     increment/decrement of variable;
                                    }


 */

import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {

//        int i=10;
//        while(i>=0)
//        {
//            System.out.println(i);
//           // i=i+1;
//            //i++;
//            i-=3;
//        }

          Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Starting No:");
//        int start=scanner.nextInt();
//        System.out.println("Enter Ending No:");
//        int end=scanner.nextInt();
//        while(start<=end)
//        {
//            System.out.println(start);
//            start++;
//        }

//        System.out.println("Enter No:");
//        int no= scanner.nextInt();
//        int start=1;
//        while(start<=10)
//        {
//            System.out.println(no+" * "+ start +" = "+ start*no);
//            start++;
//        }

        System.out.println("Enter No:");
        int no= scanner.nextInt();
        int start=1;
        while(start<=no)
        {
             if (no%start==0)
             {
                 System.out.println(start);
             }
             start++;
        }


    }

}
