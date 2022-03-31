public class Q6 {
    public static  boolean compare(String a,String b) {

if(a==null || b==null){
    return false;

}
if(a.length()!=b.length()) {
    return false;
}
        for(int i=0;i<a.length();i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;

            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(compare(str1,str2));
    }}

