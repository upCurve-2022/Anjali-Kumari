public class Q5 {
    public static void main(String[] args) {
        String str="";
//
        int count=0;
        char[] charStr=str.toCharArray();
        for(char c:charStr){
            count++;
        }
        System.out.println(count);
        if(count==0){
            System.out.println("empty");
        }

    }
}
