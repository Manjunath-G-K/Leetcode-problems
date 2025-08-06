package Day2;

/*
LeetCode Problem: 242 - Valid Anagram

-Time Complexity: O(n)
- Space Complexity: O(1)
*/

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println("Is Anagram: " + isAnagram(s, t));
    }
}

