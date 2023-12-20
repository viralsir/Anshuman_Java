public class SwapDemo {
    public static void main(String[] args) {

        int no1=23,no2=34;

//        int no3=no1; // no3=23
//        no1=no2;  // no1=34
//        no2=no3;
//
        no1=no1+no2;
        no2=no1-no2;
        no1=no1-no2;

        System.out.println("no1:"+no1+" no2:"+no2);
    }
}
