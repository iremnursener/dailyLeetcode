import java.util.HashMap;

public class leetcode205_hashmap {


    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));  // true
        System.out.println(isIsomorphic("foo", "bar"));  // false
        System.out.println(isIsomorphic("paper", "title"));  // true
        System.out.println(isIsomorphic("ab", "aa"));  // false
    }




    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // s -> t kontrolü
            if (mapST.containsKey(charS)) {
                if (mapST.get(charS) != charT) return false;
            } else {
                mapST.put(charS, charT);
            }

            // t -> s kontrolü
            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) return false;
            } else {
                mapTS.put(charT, charS);
            }
        }

        return true;




    }


}
