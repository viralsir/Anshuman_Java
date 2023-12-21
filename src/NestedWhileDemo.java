
public class NestedWhileDemo
{

    public static void main(String[] args) {

        int i=1;
        while (i<=5)
        {
            int j=i;
            while(j<=5)
            {
                System.out.print(j);
                j=j+1;
            }
            System.out.println("");
            i++;
        }

    }
}
