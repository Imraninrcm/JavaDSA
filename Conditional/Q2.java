package Conditional;

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter your temperature:");
       float a = input.nextFloat();
       String ans = ((a>100)?"You have a fever":"You don't have a fever");
       System.out.println(ans);
       input.close();
    }
}