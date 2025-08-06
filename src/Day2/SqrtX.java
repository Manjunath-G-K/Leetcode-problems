package Day2;

/*
LeetCode Problem: 69 - Sqrt(x)

Approach:
- Using  binary search to find the integer square root.
- we can solve it using Math.sqrt   like return (int)Math.sqrt(x);


Time Complexity: O(log n)
Space Complexity: O(1)
*/

class SqrtX {
    public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long)mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println("Sqrt of " + x + " is: " + mySqrt(x));
    }
}
