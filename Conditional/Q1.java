package Conditional;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number:");
       float a = input.nextFloat();
       String ans = ((a>=0)?"Positive":"Negative");
       System.out.println(a + " is " + ans);
       input.close();
    }
}