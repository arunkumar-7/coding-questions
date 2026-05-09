import java.util.Scanner;

//Factorial of a given non-negative integer
public class FactorialRecursion {
    static long factorial(int n) {
        if (n < 0) {
            System.out.println("Please enter a non-negative integer");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        long result = factorial(n);
        if (result != -1) {
            System.out.println("Factorial of " + n + " is " + result);
        }
        sc.close();
    }

}
