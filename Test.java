// import java.util.Scanner;
import java.lang.Math;

public class Test {

    // public static int intInput() {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter a number:");
    //     int n = input.nextInt();
       
    //     return n;
    // }


    // reverse no method
    public static int reverseNo(int n){
        int reverse =  0;
        while(n>0){
            int lastDigit = n%10;
            reverse = (reverse*10) + lastDigit; 
            n /= 10;
        }
        return reverse;
    }

    //prime no method
   public static boolean isPrime(int n){
    if(n == 2){
        return true;
    }else if(n>2){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
    }else{
        return false;
    } 
    return true;   
    }

    //factorial of n
    public static int fact(int n) {
        int factorial = 1;
        for(int i=1; i<=n;i++){
            factorial *= i;
        }
        return factorial;        
    }

    //nCr formula
    public static int nCr(int n, int r) {
        return ((fact(n)) /(fact(r)*(fact((n-r)))));
    }

    public static int product(int a, int b) {
        return(a*b);        
    }

    public static void primeInRange(int start, int end){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
   public static void main(String[] args){
    // int n = intInput();
    // int r = intInput();
   
   }
}
