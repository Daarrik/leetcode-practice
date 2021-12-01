class Substrings {
  public static int lengthOfLongestSubstring(String s) {
    String currentSub = "";
    String maxSub = "";
    char[] chars = s.toCharArray();
    if (s.length() <= 1) return s.length();
    for (int i = 0; i < chars.length; i++) { 
      if (currentSub.indexOf(chars[i]) == -1) {
        currentSub += chars[i];
        if (currentSub.length() > maxSub.length())
          maxSub = currentSub;
      } else {
        currentSub = currentSub.substring(currentSub.indexOf(chars[i])+1) + chars[i];
      }
    }
    return maxSub.length();
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"));
  }
}