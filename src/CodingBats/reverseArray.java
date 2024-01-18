package CodingBats;

import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] nums) {
        int length = nums.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[length - 1 - i] = nums[i];
        }

        return reversedArray;
    }
}
