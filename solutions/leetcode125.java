public class leetcode125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s)); // true
    }

    public static boolean isPalindrome(String s) {

        int matchFound = 0;
        String filtered = s.chars()
                .filter(Character::isLetterOrDigit) // Harf veya rakamları al
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()
                .toLowerCase();

        char[] charArrayOfString = filtered.toCharArray();

        int left = 0;
        int right=charArrayOfString.length-1;

        while (left<right){
            if(charArrayOfString[left]!=charArrayOfString[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
