public class Q3 {
    public static void main(String[] args) {
        String str="123ab4566";
        boolean result=str.matches("[0-9]+");
        System.out.println("original string="+ str);
        System.out.println("does it contain only digits="+result);
    }
}
