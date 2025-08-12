 package Variables;

import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter price of Pencil, pen, eraser:");
        float pencil = input.nextFloat();
        float pen = input.nextFloat();
        float eraser = input.nextFloat();

        System.out.println("---------INVOICE----------");
        System.out.println("Pencil Rs:" + pencil);
        System.out.println("Pen Rs:" + pen);
        System.out.println("Eraser Rs:" + eraser);
        float total = pencil+pen+eraser;
        System.out.println("Total with GST(18%) Rs:" + (total+(total*0.18)));

        input.close();
    }
}