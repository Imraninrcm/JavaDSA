package Loops;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenSum = 0, oddSum = 0;
        System.out.print("Choose a integer number:");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("enter " + i + " no:");
            int num = input.nextInt();
            if(num%2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }
        }

        System.out.println("Even no's sum is:" + evenSum);
        System.out.println("Odd no's sum is:" + oddSum);
        input.close();
    }
}