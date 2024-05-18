import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TwoSum {
    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>(); // Initialize the hash map
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i]; // Calculate the difference
            if (numToIndex.containsKey(difference)) { // Check if the difference is in the map
                return new int[] { numToIndex.get(difference), i }; // Return the indices
            }
            numToIndex.put(nums[i], i); // Add the current number and its index to the map
        }
        throw new IllegalArgumentException("No two sum solution"); // Throw an exception if no solution is found
    }
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("result is"+result[0]+"result is "+result[1]);
    }
}