/*
LeetCode Problem: Two Sum
Problem Number: 1

Diff Approches:
- Brute Force
- Using HashMap

Time Complexity:
- Brute Force: O(n^2)
- HashMap: O(n)


Space Complexity:
- Brute Force: O(1)
- HashMap: O(n)

*/

// -->> Brute Force Approach
import java.util.Arrays;
class TwoSum {
    public static int[] twoSum ( int[] nums, int target ) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] {}; // if no answer
    }

    public static void main ( String[] args ) {
        int[] nums = {1, 6, 8, 2, 4};
        int target = 10;
        int[] result = twoSum (nums, target);
        System.out.println ("Indices: " + Arrays.toString (result));
    }
}

// -->> HASHMAP APPROACH
/*import java.util.HashMap;

class TwoSum {
    public int[] twoSum ( int[] nums, int target ) {
        HashMap<Integer, Integer> map = new HashMap<> (); // num -> index
        for (int i = 0; i < nums.length; i++) {

            int comp = target - nums[i];
            if (map.containsKey (comp)) {
                return new int[]{map.get (comp), i};
            }

            map.put (nums[i], i);
        }
        return new int[]{};
    }
}
*/
