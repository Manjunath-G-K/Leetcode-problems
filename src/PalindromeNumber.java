/*
LeetCode Problem: Palindrome Number
Problem Number: 9

Approach:
- Using string conversion
- Using full number reversal

Time Complexity:
- O(log(n))

Space Complexity:
- O(1)
*/

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

        // Negative numbers and numbers ending in 0 but not 0 itself are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 1221;
        System.out.println("Is Palindrome: " + isPalindrome(number));  // true
    }
}
