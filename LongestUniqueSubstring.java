import java.util.HashSet;

//Longest Substring Without Repeating Characters

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLen = 0, i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(str.charAt(i++));
            }
        }

        System.out.println("Longest substring length without repeating characters: " + maxLen);
    }
}
