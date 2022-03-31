public class Q7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 25;
        int largest;
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("largest is:" + a);
                System.out.println("second larget="+b);
            }else{
                System.out.println("largest is:" + a);
                System.out.println("second larget="+c);
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println("largest is:" + b);
                System.out.println("second larget="+a);
            }else{
                System.out.println("largest is:" + b);
                System.out.println("second larget="+c);
            }



        }
        if (c > a && c > b) {
            if (a > b) {
                System.out.println("largest is:" + c);
                System.out.println("second larget="+a);
            }else{
                System.out.println("largest is:" + c);
                System.out.println("second larget="+b);
            }

        }


    }

}