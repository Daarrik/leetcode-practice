public class PalindromeNum {
  public static boolean isPalindrome(int x) {
    int orig = x;
    if (x < 0) return false;
    String rev = "";
    while (x > 0) {
      rev += x % 10;
      x /= 10;
    }
    return rev.equals(""+orig);
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }
}
