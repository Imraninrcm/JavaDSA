 package Variables;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float avg = (a+b+c)/3;
        System.out.println("avarage of " + a + "," + b + "&" + c + " is: " +  avg);
        input.close();
    }
}