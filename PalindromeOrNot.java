package week1Day2;

public class PalindromeOrNot {

	public static void main(String[] args) {
        int input = 121; // You can change this to test other values
        int output = 0;
        int original = input;

        for (; input != 0; input = input / 10) {
            int digit = input % 10;
            output = output * 10 + digit;
        }

        if (original == output) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}