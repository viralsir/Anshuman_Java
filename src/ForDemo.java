import java.util.Scanner;

/*
    for :-
    syntax : -
    for(intilization of variable;condition;incrment/decrement of variable)
    {
            statement;
           }
 */
public class ForDemo
{
    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter No:");
//        int no= scanner.nextInt();

//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(no+" * "+i+" = "+no*i);
//        }

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}
