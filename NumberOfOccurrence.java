public class NumberOfOccurrence {
    public static void main(String[] args) {
        String input = "hello yam";
        char letter = 'o';
        int occurrences = countOccurrences(input, letter);
        System.out.println("The character '" + letter + "' appears " + occurrences + " times in the string.");
    }
    public static int countOccurrences(String str, char letter) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


}
