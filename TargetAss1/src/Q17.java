public class Q17 {
    public static void main(String[] args) {
        int n=12;
        int m=15;
        int i=0;int num=0;
        String primeNumbers=" ";
        for (i = n; i <= m; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from n to m are :");
        System.out.println(primeNumbers);
    }
    }

