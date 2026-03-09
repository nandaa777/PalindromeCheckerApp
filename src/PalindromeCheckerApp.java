import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Normalize by removing non-alphanumeric characters and lowercasing
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The input is a palindrome (ignoring non-alphanumeric characters).");
        } else {
            System.out.println("The input is NOT a palindrome.");
        }

        scanner.close();
    }
}