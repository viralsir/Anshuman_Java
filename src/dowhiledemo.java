import UnitTest.Product;

/*
    do while :-
        initialization of variable
        do
        {
             statement;
             increment/decrement of variable;
            }while(condition);
 */
public class dowhiledemo
{
    public static void main(String[] args) {
        Product pr=new Product();

        int i = 1;
        do
        {
            int j=1;
            do
            {
                System.out.print(j);
                j++;
            }while(j<=i);

            System.out.println("");
            i++;
        }while(i<=5);
    }
}
