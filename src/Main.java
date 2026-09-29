//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(10));
        System.out.println(fibonacci(2));
        System.out.println(isPrime(10));
        System.out.println(sumOfDigits(125));
        System.out.println(isPolindrom("Zaman"));
        System.out.println(reciprocal(321));
        System.out.println(countOfDigit(4456568));
    }

    //Verilmiş n ədədinin faktorialını hesablayan metod
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;

        }
        return fac;
    }
   // İlk n Fibonacci ədədini qaytaran metod
       public static int fibonacci(int n) {
        int a=1;
        int b=1;
        int c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
       }
     //Verilmiş ədədin sadə (prime) olub-olmadığını yoxlamaq
     public static boolean isPrime(int n){
        if(n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
     }
    //Verilmiş sözün palindrom olub-olmasi

    static boolean isPolindrom(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    // Ededin reqemlerinin cemin tapmaq
    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) { //123
            sum += n % 10; //5+1
            n = n / 10; //1
        }
        return sum;
    }


     //Verilmiş ədədi tərsinə çevirən metod

    static long reciprocal(long n) {
        boolean menfi = n < 0;
        n = Math.abs(n);
        long result = 0;
        while (n > 0) {   //321- 123
            result = result * 10 + n % 10;   //1  12  123
            n /= 10;              //32     3
        }
        if (menfi) {
            return -result;
        }
        return result;
    }

    //ededin reqemlerinin sayini tapan metod

    static int countOfDigit(long n) {
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }



}