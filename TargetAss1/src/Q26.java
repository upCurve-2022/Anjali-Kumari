import java.lang.*;
public class Q26 {
    public static void main(String[] args) {
        String str="aabaa";
        String reverse="";
       int strLength=str.length();
       for(int i=strLength-1;i>=0;i--){
           reverse=reverse+str.charAt(i);
       }
if(str.toLowerCase().equals(reverse.toLowerCase())){
    System.out.println("palindrome");
}else
    System.out.println("no");

    }
}
