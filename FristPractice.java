import java.util.*;

class FirstPractice{
    // FirstPractice() {
    //     haloWorld();      // Call method from constructor
    //     print5Stars();    // Call method from constructor
    // }
    public static void print5Stars(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of stars: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void haloWorld() {
        System.out.println("Halo World!");
    }

    public static void printRectangleStar() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        System.out.println("Print the number of columns: ");
        int m = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangleStar() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle1Star() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Here work of ith row is --print of star and hit on enter
    // relation between row number & star count 
    // Assumption:  Count of star in any ith row is x. ==> i+x = n+1 ==> it's a relation 
    public static void printTriangle1ORStar() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printSpecialDaimond() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        // Part-1
        for (int i = n; i >= 1; i--) {
            int starCount = i;
            int spaceCount = (n - i) * 2;
            // star 1
            for (int j = 1; j <= starCount; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("- ");
            }
            // star 2
            for (int j = 1; j <= starCount; j++) {
                System.out.print("* ");
            }
            // hit an enter
            System.out.println();
        }
        
        // Part-2
        for (int i = 1; i <= n; i++) {
            int starCount = i;
            int spaceCount = (n - i) * 2;
            // star 1
            for (int j = 1; j <= starCount; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("- ");
            }
            // star 2
            for (int j = 1; j <= starCount; j++) {
                System.out.print("* ");
            }
            // hit an enter
            System.out.println();
        }
    }

    public static void printNumTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }

    public static void printInverteddNumTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        int val = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }

    public static void printNum2Triangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = i + 1;
            }
            System.out.println();
        }
    }

    public static void printNum3Triangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        // int val = 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
                // j = 1;
                // i = 1;
            }
            System.out.println();
        }
    }

    public static void printNum4Triangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = j + 1;
            }
            System.out.println();
        }
    }

    public static void printNum5Triangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        int val;
        for (int i = 1; i <= n; i++) {
            val = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }

    public static void printRevTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            // print space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // print start space (*_): (n-i)
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print1Triangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = n; i >= 0 ; i--) {
            // print space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // print start space (*_): (n-i)
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numPatternTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n ; i++) {
            int starCount = (2*i) - 1;
            int spaceCount = n-i;
            // print space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("0 ");
            }
            // print start space (*_): (n-i)
            for (int j = 1; j <= starCount; j++) {
                System.out.print("1 ");
            }
            // print space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("0 ");
            }
            // hit enter
            System.out.println();
        }
    }

    public static void printTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = n; i >= 0 ; i--) {
            // print space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // print start space (*_): (n-i)
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numPattern1Triangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n ; i++) {
            int starCount = (2*i) - 1;
            int spaceCount = n-i;
            // print space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("0 ");
            }
            // print star1 + star2 = (2*i - 1)
            int val = 1;
            for (int j = 1; j <= starCount; j++) {
                System.out.print(val + " ");
                val++;
            }
            // print space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("0 ");
            }
            // hit enter
            System.out.println();
        }
    }

    public static void numPattern2Triangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n ; i++) {
            int starCount = (2*i) - 1;
            int spaceCount = n-i;
            // print space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("0 ");
            }
            // print star1 + star2 = (2*i - 1)
            int val = i;
            for (int j = 1; j <= starCount; j++) {
                System.out.print(val + " ");
                if (j <= starCount / 2) {
                    val++;
                } else {
                    val--;
                }
                
            }
            // print space
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("0 ");
            }
            // hit enter
            System.out.println();
        }
    }

    public static void printCHarA2Z() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    public static void printCHarPattern() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            // val = i;
            // char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                // val++;
                ch++;
            }
            System.out.println();
        }
    }

    public static void printCHar1Pattern() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print the number of rows: ");
        int n = scn.nextInt();
        // char ch = 'A';
        for (int i = 0; i < n; i++) {
            // val = i;
            char ch = (char)('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                // val++;
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // haloWorld();
        // print5Stars();
        FirstPractice obj = new FirstPractice();
        // obj.haloWorld();
        // obj.print5Stars();
        // obj.printRectangleStar();
        // obj.printTriangleStar();
        // obj.printTriangle1Star();
        // obj.printTriangle1ORStar();
        // obj.printSpecialDaimond();
        // obj.printNumTriangle();
        // obj.printInverteddNumTriangle();
        // obj.printNum2Triangle();
        // obj.printNum3Triangle();
        // obj.printNum4Triangle();
        // obj.printNum5Triangle();
        // obj.printRevTriangle();
        // obj.print1Triangle();
        // obj.numPatternTriangle();
        // obj.numPattern1Triangle();
        // obj.numPattern2Triangle();
        // obj.printCHarA2Z();
        obj.printCHarPattern();
        obj.printCHar1Pattern();
    }

}