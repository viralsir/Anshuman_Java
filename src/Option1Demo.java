public class Option1Demo
{
      private int pr=233;
      protected int pro=2333;
      int d=34;
      public int u=343;

}
class Option2Demo extends Option1Demo{
    public static void main(String[] args)
    {
        Option2Demo option1Demo=new Option2Demo();

      //  System.out.println("Private int pr:"+option1Demo.pr);
        System.out.println("Protected int pro :"+option1Demo.pro);
        System.out.println("Default int d:"+option1Demo.d);
        System.out.println("Public int u :"+option1Demo.u);

    }


}


