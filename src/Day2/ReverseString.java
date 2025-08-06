package Day2;

/*
LeetCode Problem: 344 - Reverse String

Approach:
- Using  two pointer tecnique  to reverse the array in place.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println("Reversed String: " + new String(s));
    }
}
