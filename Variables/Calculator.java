package Variables;
import java.util.Scanner;

public class Calculator {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 numbers and opration(+, -, *, /, %) to perform:");
    float a = input.nextFloat();
    float b = input.nextFloat();
    char op = input.next().charAt(0);

    switch (op) {
        case '+': System.out.println(a + " + " + b + " = " + (a+b));
                  break;
        case '-': System.out.println(a + " - " + b + " = " + (a-b));
                  break;
        case '*': System.out.println(a + " * " + b + " = " + (a*b));
                  break;
        case '/': System.out.println(a + " / " + b + " = " + (a/b));
                  break;
        case '%': System.out.println(a + " % " + b + " = " + (a%b));
                  break;
        default:System.out.println("Please select valid operation");
    }

    input.close();
}
}
