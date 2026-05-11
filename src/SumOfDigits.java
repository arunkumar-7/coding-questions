import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;  //get last digit
            sum = sum + digit;
            num = num / 10;        //remove last digit
        }
        System.out.println("The sum of digits is: " + sum);
        sc.close();
    }
}
