public class Q20 {
    public static void main(String[] args) {
        int num=1100100;

        int decimalNumber = 0;
        int remainder=0;
        int i=0;
        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println(decimalNumber);
    }
}
