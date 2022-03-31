public class Q9 {
    public static void main(String[] args) {
        int n=12345;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            System.out.print(rem);
        }
    }
}
