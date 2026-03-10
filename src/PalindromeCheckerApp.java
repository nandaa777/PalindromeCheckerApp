import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" Palindrome Checker - UC8, UC9 & UC10");
        System.out.println(" Ignore Case + Spaces");
        System.out.println("=================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string (UC10 feature)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Recursive approach
        boolean recursiveResult =
                checkPalindromeRecursive(normalized, 0, normalized.length() - 1);

        // Convert string to Linked List
        Node head = null;
        Node tail = null;

        for (int i = 0; i < normalized.length(); i++) {
            Node newNode = new Node(normalized.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Linked List approach
        boolean linkedListResult = checkPalindromeLinkedList(head);

        System.out.println("Recursive Result: " + recursiveResult);
        System.out.println("LinkedList Result: " + linkedListResult);

        scanner.close();
    }

    // Recursive function (UC9)
    public static boolean checkPalindromeRecursive(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return checkPalindromeRecursive(str, start + 1, end - 1);
    }

    // Linked List palindrome check (UC8)
    public static boolean checkPalindromeLinkedList(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Reverse linked list
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}