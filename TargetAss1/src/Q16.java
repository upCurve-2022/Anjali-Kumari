public class Q16 {
    public static void main(String[] args) {
        int n=50;
        int i=1;
        int j=1;
        if(n>0){
            while(i<=n){
                if(j%3!=0){
                    System.out.println(i+ " ");
                    i=i+4*j;
                }
                j++;

            }
        }
    }
}
