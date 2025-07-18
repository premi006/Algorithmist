package Begineer_Module;

import java.util.Scanner;

public class BeginnerFunction {
    public static int sumOfEvenNo(int A) {
        int sum = 0;
        for (int i = 2; i <= A; i = i + 2) {
            sum += i;
        }
        return sum;
    }

    public static double areaOfCircle(int r) {
        double area = (Math.PI) * r * r;
        double res = Math.ceil(area);
        return res;
    }

    public static int test(int n) {
                if(n % 2 == 0) {
                    return 2;
                } 
                if (n % 5 == 0) {
                    return 5;
                }
                return n;
    }

    public static int sumOfFactor(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                sum = sum + i;
            }
        
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scn.nextInt();
        // int result = sumOfEvenNo(n);
        // System.out.println("Sum of even number till " + n + " is: " + result);

        // double ans = areaOfCircle(n);
        // System.out.println("Area of circle with raidus " + n + " is: " + ans);

        // int res = test(n);
        // System.out.println(res);

        int ne = sumOfFactor(n);
        System.out.println(ne);

    }
}
