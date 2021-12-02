// ??????

import java.util.Arrays;
import java.util.List;

public class WordBreak {
  public static boolean wordBreak(String s, List<String> wordDict) {
    for (String word : wordDict) {
      int wordIndex = s.indexOf(word);
      if (wordIndex != -1) {
        String newString = "";
        for (String splitWord : s.split(word)) {
          newString += (splitWord.equals("") ? "" : splitWord);
        }
        s = newString;
      } else {
        return false;
      }
    }
    return s.length() == 0;
  }

  public static void main(String[] args) {
    String s = "applepenapple";
    String[] words = new String[]{"apple", "pen"};
    List<String> wordDict = Arrays.asList(words);
    System.out.println(wordBreak(s, wordDict));
    // for (String word : s.split("apple"))
    //   System.out.println(word.equals(""));
    // System.out.println("test");
  }
}
