package Day2;/*
LeetCode Problems - Day 2: Power Series

Problems Covered:
- 231. Power of Two
- 326. Power of Three
- 342. Power of Four



Time Complexity For This :
- Each Method: O(log(n)) → for all (2, 3, or 4)

Space Complexity:
- O(1) → constant
*/

class PowerProblems {

    // 231. Power of Two
    public static boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    // 326. Power of Three
    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    // 342. Power of Four
    public static boolean isPowerOfFour(int n) {
        if (n < 1) return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
         System.out.println (isPowerOfFour (16));// True
        System.out.println (isPowerOfThree (27));//  True

        }
    }
}
