//count vowels and consonants in a String

import java.util.Scanner;

public class CountVowelsConsonants {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        sc.close();
    }
}

