import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode392 {

    public static void main(String[] args) {


        // Test Case 1: s is a subsequence of t
        System.out.println(isSubsequence("abc", "ahbgdc")); // true

        // Test Case 2: s is NOT a subsequence of t
        System.out.println(isSubsequence("axc", "ahbgdc")); // false

        // Test Case 3: s is empty (empty string is a subsequence of any string)
        System.out.println(isSubsequence("", "ahbgdc")); // true

        // Test Case 4: t is empty but s is not
        System.out.println(isSubsequence("abc", "")); // false

        // Test Case 5: s and t are the same
        System.out.println(isSubsequence("ahbgdc", "ahbgdc")); // true

        // Test Case 6: Single character match
        System.out.println(isSubsequence("a", "a")); // true

        // Test Case 7: Single character mismatch
        System.out.println(isSubsequence("a", "b")); // false
    }


    public static boolean isSubsequence(String s, String t) {
        int matchFound = 0;

        int currentSearhedIndex = 0;
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        for (int i = 0; i < t.length(); i++) {
            if (currentSearhedIndex < charArrayS.length && charArrayT[i] == charArrayS[currentSearhedIndex]) {
                currentSearhedIndex++;
                matchFound++;

            }
        }
        if (matchFound == s.length()) {
            return true;
        }


        return false;

    }


}
