import java.util.*;

public class TwoPractice {
    public static void printFactorial() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number for which you want factorial: ");
        int n = scn.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            // ans = ans * i;
            ans *= i;
        }
        System.out.println(ans);
    }

    public static int returnFactorial() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number for which you want factorial: ");
        int n = scn.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            // ans = ans * i;
            ans *= i;
        }
        return ans;
    }

    public static int returnFact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            //ans = ans * i;
            ans *= i;
        }
        return ans;
    }

    // public static void printNCR() {
    //     Scanner scn = new Scanner(System.in);
    //     System.out.print("Enter the number for which you want factorial: ");
    //     int n = scn.nextInt();
    //     int ans = 1;
    //     for (int i = 1; i <= n; i++) {
    //         ans = ans * i;
    //     }
    //     System.out.println(ans);
    // }

    public static void main(String[] args) {
        // when method is void
        // TwoPractice tpObj = new TwoPractice(); // constructor calling oject
        // tpObj.printFactorial();
        
        printFactorial();

        // when method return something like int, long, string etc 
        int result = returnFactorial();  // call the static method
        System.out.println("Factorial is: " + result);

        int n = 4;
        int answer = returnFact(n);
        System.out.println("Fact is: " + answer);
    }
}
