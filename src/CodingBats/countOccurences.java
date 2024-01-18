package CodingBats;

public class countOccurences {
    public static void main(String[] args) {
        String text = "Hello, how many times does 'o' appear in this text?";
        char target = 'o';

        int count = countOccurrences(text, target);

        System.out.println("The character '" + target + "' appears " + count + " times in the text.");
    }

    public static int countOccurrences(String text, char target) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}
