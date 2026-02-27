public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";

        for(int i = original.length() - 1; i >= 0; --i) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a palindrome.");
        }

    }
}