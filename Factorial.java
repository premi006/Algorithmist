package Begineer_Module;

import java.util.*;

public class Factorial {
    public static int returnFactorial() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number for which you want factorial: ");
        int n = scn.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static int reFactorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static int sumOf2Num(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Max of two numbers
    public static void maxOf2Num(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }



    // product of 2 numbers
    public static void productOf2Num(int a, int b) {
        int prod = a * b;
        System.out.println(prod);
    }

    public static void main(String[] args) {
        // int result = returnFactorial();
        // System.out.print("Factorial is: " + result);
        int n = 6;
        int r = 2;

        // int x = reFactorial(n);
        // int y = reFactorial(n - r);
        // int z = reFactorial(r);

        // int ans = x / (y * z);
        // System.out.print("Factorial of nCr is: " + ans);

        // int result = sumOf2Num(n, r);
        // System.out.print("Sum of 2 numbers is: " + result);

        System.out.println("Max of two numbers is: ");
        maxOf2Num(n, r);

        System.out.println("Product of 2 numbers is: ");
        productOf2Num(n, r);

        double ans = Math.ceil(8.4);
        System.out.println(ans);

        double Ans = Math.floor(5.8);
        System.out.println(Ans);
    }
}
