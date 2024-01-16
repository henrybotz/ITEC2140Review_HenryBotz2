public class ArrayPractice1 {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};


        int sum = calculateSum(numbers);


        System.out.println("Sum of array elements: " + sum);
    }
    public static int calculateSum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
