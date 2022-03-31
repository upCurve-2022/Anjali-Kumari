public class Q8 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
        }
        System.out.println(sum);
int sumodd=0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sumodd = sumodd + i;

            }
        }
        System.out.println(sumodd);

    }
}