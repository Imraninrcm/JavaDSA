import java.util.Scanner;
import java.lang.Math;

public class Test {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        // number reversing
    // System.out.print("Enter a number:");
    // int n = input.nextInt();
    // int reverseNo =  0;
    // while(n>0){
    //     int lastDigit = n%10;
    //     reverseNo = (reverseNo*10) + lastDigit; 
    //     n /= 10;
    // }
    // System.out.println(reverseNo);
   System.out.print("Enter a number");
    int n = input.nextInt();
    boolean isPrime = false;

    if(n >= 2){
        for(int i=1;i<=Math.sqrt(n); i++){
            if(n%i == 0){
                isPrime = true;
                break;
            }else{
                isPrime = false;
            }
        }
    }else{
        isPrime = false;
    }
   
    if(isPrime){
        System.out.println(n + " is a prime number");
    }else{
        System.out.println(n + " is not a prime number");
    }

   input.close();
   }
}
