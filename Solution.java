//Leetcode Problem (Remove Element)
//The logic used in this paricular problem is deleting the value , n - number of times from the array and also return the value of size of the resultant array/!
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // The pointer for the current position of non-'val' elements

        //Let's  Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Replace the value at index k with the value at index i
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int[] expectedNums1 = {2, 2};

        Solution solution = new Solution();
        int k1 = solution.removeElement(nums1, val1);

        // Assertions to validate the result using the custom judge
        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }

        System.out.println("Output for Example 1: " + k1); // Output: 2

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int[] expectedNums2 = {0, 1, 3, 4, 0};

        int k2 = solution.removeElement(nums2, val2);

        // Assertions to validate the result using the custom judge
        assert k2 == expectedNums2.length;
        for (int i = 0; i < k2; i++) {
            assert nums2[i] == expectedNums2[i];
        }

        System.out.println("Output for Example 2: " + k2); // Output: 5
    }
}


/*
Explanation:
The removeElement method is the core of this code. It efficiently removes all occurrences of a specified value val from the nums array in-place. It returns the length of the modified array, which includes only elements that are not equal to val.

Inside the removeElement method:

int k = 0; initializes the pointer k to track the current position for non-'val' elements in the array.

The for loop iterates through each element in the nums array.

The if condition checks if the current element nums[i] is not equal to val.

If the condition is met, it replaces the value at index k with the value at index i. This effectively removes val from the array.

After the replacement, the k pointer is incremented, which tracks the length of the modified array.

Finally, the method returns the value of k, which represents the length of the modified array.

The main method contains two test cases with example data (nums1, val1, and expectedNums1 for Example 1, and nums2, val2, and expectedNums2 for Example 2). These test cases demonstrate the functionality of the removeElement method and validate the results using assertions.

Assertions are used to verify that the length of the modified array k matches the length of the expected result arrays (expectedNums1 and expectedNums2). It also checks that the elements in the modified nums array match the expected result arrays for both examples.

The System.out.println statements are used to display the output length k for each example, which should match the expected output.*/
