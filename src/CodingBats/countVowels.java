package CodingBats;

public class countVowels {
    public static void main(String[] args) {

        String input = "hello";
        int vowelCount = countVowels(input);

        System.out.println("The number of vowels in the string is: " + vowelCount);
    }

    public static int countVowels(String str) {

        str = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
