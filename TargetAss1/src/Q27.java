public class Q27 {
    public static void main(String[] args) {
        int n=153;
        int org=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==org){
            System.out.println("yes");
        }
        else
            System.out.println("no");

    }
}
