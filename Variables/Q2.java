 package Variables;

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of the squar:");
        float side = input.nextFloat();
        float area = side * side;
        System.out.println("Area of the square is:" + area);
        input.close();
    }
}