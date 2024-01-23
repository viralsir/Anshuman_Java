import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;
// int ,char
// String
// StringTokenizer

public class StringDemo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Name :");
        String name=scanner.next();

//        System.out.println("Name :"+name);
//        System.out.println("upper case :"+name.toUpperCase());
//        System.out.println("lower case :"+name.toLowerCase());
//        System.out.println("reverse :"+ name.substring(3));
//        System.out.println("reverse :"+ name.substring(3,5));
//        System.out.println("Name :"+name);
//        String name2="Shah";
//
//        String name3=name.concat(name2);
//        String name4=name2.concat(name);
//        String name5=name+name2+name3;
//        System.out.println("name :"+name);
//        System.out.println("name2:"+name2);
//        System.out.println("name3:"+name3);
//        System.out.println("name4:"+name4);
//        System.out.println("name5:"+name5);
//
//        System.out.println("character :"+name.charAt(2));
//

        System.out.println("Enter name:");
        String name2=scanner.next();
        if(name.equalsIgnoreCase(name2))
        {
            System.out.println("both string are same ");
        }
        else
        {
            System.out.println("both string are not same ");
        }

        System.out.println("contains a :"+ name.contains("a") );
        System.out.println("index of :"+name.indexOf("a"));
        System.out.println("index of :"+name.indexOf("a",4));

        System.out.println(name.startsWith("vi"));
        System.out.println(name.endsWith("al"));
        System.out.println("no of character :"+name.length());


    }
}
