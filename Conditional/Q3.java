package Conditional;

import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a week number(1-7):");
        int n = input.nextInt();
        switch (n) {
            case 1:System.out.println("It is Monday");
                    break;
            case 2:System.out.println("It is tuesday");
                    break;
            case 3:System.out.println("It is Wednesday");
                    break;
            case 4:System.out.println("It is Thursday");
                    break;
            case 5:System.out.println("It is Friday");
                    break;
            case 6:System.out.println("It is saturday");
                    break;
            case 7:System.out.println("It is Sunday");
                    break;
            default:System.out.println("Please enter valid week(1-7) no.");
                break;
        }
        input.close();
    }
}