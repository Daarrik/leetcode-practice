import java.util.HashMap;
import java.util.Map;

public class Anagram {
  public static boolean isAnagram(String s, String t) {
    if (s==null && t==null) return true;
    else if (s==null || t==null) return false;
    else if (s.length() != t.length()) return false;
    Map<Character, Integer> letters = new HashMap<>();
    for (char letter : s.toCharArray()) letters.put(letter, letters.getOrDefault(letter, 0) + 1);
    for (char letter : t.toCharArray()) {
      int count = letters.getOrDefault(letter, 0);
      if (count == 0) return false;
      letters.put(letter, count-1);
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isAnagram("ab", "a"));
  }
}
