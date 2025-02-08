public class leetcode151 {

    public static void main(String[] args) {
        String s = "  Merhaba dünya   nasılsın  ";
        System.out.println(reverseWords(s)); // true
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim();
    }
}
