package Conditional;

import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year for finding its leap year or not:");
        int y = input.nextInt();
        if(y%4 == 0 && (y%400==0 || y%100!=0)){
            System.out.println(y + " is a leap year");
        }else{
            System.out.println(y + " is a not a leap year");
        }
        input.close();
    }
}