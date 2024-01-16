public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] numbers = {12, 45, 78, 23, 56, 89, 34, 67};


        int maxValue = findMaxValue(numbers);
        System.out.println("Maximum value in the array: " + maxValue);
    }

    public static int findMaxValue(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }


        int max = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
