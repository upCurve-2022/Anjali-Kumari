import java.util.ArrayList;
import java.util.Scanner;



public class Q7 {
    static boolean isDigit(char c){
        if(!(c>='0' && c<='9')){
            return false;
        }
        return true;

    }
    static void removeHyphen(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-' && isDigit(str.charAt(i-1)) && isDigit(str.charAt(i+1))){
             str=str.replace(str.charAt(i), Character.MIN_VALUE);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        removeHyphen(str);

        }
    }

