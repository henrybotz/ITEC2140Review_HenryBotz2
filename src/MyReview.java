public class MyReview {
    public static void main(String[] args) {
        System.out.println(reverseDoubleChar("The"));
        System.out.println(reverseDoubleChar2("AABB"));
        System.out.println(reverseDoubleChar3("String"));
    }

    public static String reverseDoubleChar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + (word.charAt(i) + word.charAt(i));
        }
        return result;

    }
}