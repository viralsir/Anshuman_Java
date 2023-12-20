import java.util.Scanner;

public class ifdemo2 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        final int PASSING_MARKS=35;

        System.out.print("Enter Student Roll No:");
        int rollno=s.nextInt();
        System.out.print("Enter Student Name:");
        String name=s.next();
        System.out.print("Enter Student Maths Marks:");
        int maths=s.nextInt();
        System.out.print("Enter Student Science Marks:");
        int science=s.nextInt();
        System.out.print("Enter Student English Marks:");
        int english=s.nextInt();



        System.out.println("output :");
        System.out.println("RollNo:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths Marks:"+maths);
        System.out.println("Science Marks:"+science);
        System.out.println("English Marks:"+english);

        if(maths>=PASSING_MARKS && science>=PASSING_MARKS && english>=PASSING_MARKS)
        {
            System.out.println("you are pass");
            int total=maths+science+english;
            float avg=total/3.0f;
            System.out.println("Total :"+total);
            System.out.println("Avg :"+avg);

            if (avg>=90)
                System.out.println("Grade : A");
            else if(avg>=70)
                System.out.println("Grade :B");
            else if(avg>=65)
                System.out.println("Grade :C");
            else
                System.out.println("Grade :D");

        }
        else
        {
            System.out.println("you are fail ");
        }


    }

}
