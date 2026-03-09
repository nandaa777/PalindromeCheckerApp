public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }


        if (input.equals(reversed)) {
            System.out.println("Input: " + input);
            System.out.println("Is Palindrome? true");
        } else {
            System.out.println("Input: " + input);
            System.out.println("Is Palindrome? false");
        }
    }
}