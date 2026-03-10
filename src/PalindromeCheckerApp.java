import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" Palindrome Checker - UC9");
        System.out.println(" Recursive Approach");
        System.out.println("=================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    // Recursive function
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindrome(str, start + 1, end - 1);
    }
}