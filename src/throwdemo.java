import java.util.InputMismatchException;
import java.util.Scanner;

class MathException extends  Exception
{
   String msg;
    MathException(String msg)
    {
        this.msg=msg;
    }

    String  getMsg()
    {
        return msg;
    }

}

public class throwdemo
{
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter No1:");
            int no1 = scanner.nextInt();
            System.out.println("Enter No2:");
            int no2 = scanner.nextInt();

            if (no1 < 0 || no2 < 0) {
                throw new MathException("Nagative input are not allowed");
            } else {
                System.out.println("Max:"+ ((no1 > no2) ? no1 : no2));

            }
        }catch (MathException me)
        {
            System.out.println(me.getMsg());
        }
        catch (InputMismatchException ie)
        {
            System.out.println("character are not allowed");
        }

    }
}
