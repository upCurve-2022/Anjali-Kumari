import java.util.Scanner;

public class Q10 {
    static void toDigit(int n, String a[]) {
        if (n == 0) {
            return;
        }
        int num = n % 10;
        n = n / 10;
        toDigit(n, a);
        System.out.println(a[num] + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String[] a = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        toDigit(n, a);
    }
}
