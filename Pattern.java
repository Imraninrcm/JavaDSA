import java.util.Scanner;

public class Pattern {
    public static void hollowRect(int n){
        for(int i=1;i<=n;i++){
            if(i == 1 || i == n){
                for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            }else{
                for(int j=1;j<=n;j++){
                    if (j==1 || j==n) {
                System.out.print("* ");
                    } else {
                System.out.print("  ");
                    }
            }
            }
            System.out.println();
        }
    }

    public static void intRtHaPy(int n) {
        for(int i = 1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inHaPyNo(int n) {
        for(int i=1;i<=n;i++){
            int ch = 1;
            for(int j=i;j<=n; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void floydsPy(int n){
        int ch = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTri(int n){
        
        for(int i=1;i<=n;i++){
            int ch = 1;
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch--;
            }
            ch++;
            System.out.println();
        }
    }

    public static void rombus(int n) {
        for(int i = 1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void holowRombus(int n) {
         for(int i = 1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            if(i == 1 || i==n){
                for(int k = 1;k<=n;k++){
                System.out.print("* ");
            }
            }else{
                 for(int j=1;j<=n;j++){
                    if (j==1 || j==n) {
                System.out.print("* ");
                    } else {
                System.out.print("  ");
                    }
            }
            }            
            System.out.println();
        }
    }

    public static void numPy(int n) {
        int ch = 1;
        for(int i = 1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number:");
       int n = input.nextInt();
       numPy(n);
       
       input.close();
    }
}