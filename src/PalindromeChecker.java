import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        String text = input.replace(" ", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome!");
        }

        sc.close();
    }
}