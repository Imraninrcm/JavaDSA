package Loops;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a num:");
        int n = input.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + ": " + fact);

        input.close();
    }
}