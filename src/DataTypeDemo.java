/*
             Datatype : type of data

             category of data type
             1) Primary Datatype or inbuilt data type
             2) Derived Data type
             3) Abstract Data type

             1)Primary Datatype
             1 byte = 8 bits


 keyword                 use                           byte                                 range
 boolean                true/false                       jvm                                 jvm
 byte                   numeric value                   1                                    -128 to 127   255
 char                    character,symbol               2                                     -32768 to 32767
 int                    numeric value                   4                                      huge value
 long                    numeriv value                  8                                      very huge value
 float                   floating value                 8                                      very huge value
 double                  real value                     16                                     very huge value



 variable : is a name of memmory location in which data is being stored.


 naming rules of variable
 1)first character must be alphabet or underscore     no1   1no
 2)space , symbol and keyword are no allowed

 Assignment Operator :-   =

 declaration of variable :
 datatype vairablename;

 initialization of variable
 datatype variablename = value;

      each statement must end with semicolon in the main()


 */

public class DataTypeDemo
{
    public static void main(String[] args)
    {
        boolean flag=true;
        char character='s';
        String name="vimal";
        byte y;
        int no=2;
        float fl=45454545.45f;
        double dl=34535345345345345345.345345;

         y=23;
       // y=(byte)no;  // explicit type conversion


       // no=y;   // implicit type conversion

        System.out.println("boolean flag :" + flag);
        System.out.println("char character :"+character);
        System.out.println("String name:"+name);
        System.out.println("byte y:"+y);
        System.out.println("int no:"+no);
        System.out.println("float fl:"+fl);
        System.out.println("double dl:"+dl);


    }
}
