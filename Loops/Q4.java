package Loops;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a num:");
        int n = input.nextInt();
        System.out.println("Table of:" + n);
        for(int i=1;i<=n;i++){
            System.out.println(n + " × " + i + " = " + (n*i));
        }
        
        input.close();
    }
}