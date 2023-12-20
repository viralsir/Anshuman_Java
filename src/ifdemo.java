import java.util.Scanner;

/*
   conditional control structure  :
    if
       syntax :
       if(condition)
       {
            true part;
            statement;
       }
       else if(condition)
       {

       }
       else
       {
           false part;
          statement;
         }

         Relational operator

         operator                           symbol
         greater than                       >
         less than                          <
         equal to                           ==
         not equal to                       !=
         less than or
         equal to                           <=
         greater than or
         equal to                               >=


         Logical Operator
         operator                               symbol
         and                                    &&
         or                                     ||
         not                                    !

 */
public class ifdemo
{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter No1:");
        int no1=s.nextInt();
        System.out.println("Enter No2:");
        int no2=s.nextInt();
        System.out.println("Enter No3:");
        int no3=s.nextInt();

        if(no1>0 && no2>0 && no3>0)
        {
            if(no1>no2 && no1>no3)
            {
                System.out.println(no1+" is a maximum no");
            }
            else if (no2>no3 && no2>no1){
                System.out.println(no2+" is a maximum no");
            }
            else {
                System.out.println(no3+" is  a maximum no");
            }
        }
        else {
            System.out.println("negative no are not allowed.");
        }

    }
}
