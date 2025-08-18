package Patterns;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = input.nextInt();
         for (int i=0; i<n; i++){
            for (int j=n-i; j>1; j--){
               System.out.print(" ");
            }
            for (int k=0; k<=i; k++ ){
              System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
