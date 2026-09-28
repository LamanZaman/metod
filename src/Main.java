//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(10));
        System.out.println(fibonacci(2));
        System.out.println(isPrime(10));
        System.out.println(sumOfDigits(125));
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
    public static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }






}