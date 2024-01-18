import java.util.InputMismatchException;
import java.util.Scanner;

/*
      Exception : is a message which is being display when run time error is occured.

      try
      catch
      finally  :-
      throw   : UserDefine Exception
      throws  : ignore the exception : compile time exception

      io


        final : keyword  : constant
        finally : block  : {statement execute in any situation }



 */
public class ExceptionHandlingDemo
{
    public static void main(String[] args) {

        boolean flag=true;
        do {

            try
            {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter No1:");
                int no1 = scanner.nextInt();
                System.out.println("Enter No2:");
                int no2 = scanner.nextInt();

                float answer = (float) no1 / no2;

                System.out.println("Answer :" + answer);
                flag = false;
            } catch (ArithmeticException ae) {
                System.out.println("zeor is invalid as a second input");
            }
//            catch(InputMismatchException ie)
//            {
//                System.out.println("character are not allowed as a input");
//            }
//            catch (Exception e) {
//                System.out.println(e);
//            }
            finally
            {
                System.out.println("statement in finally");
            }

            System.out.println("outside try block");
        }while(flag);
    }
}
