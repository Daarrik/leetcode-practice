public class ConcatenateNums {
  public static int[] getConcatenation(int[] nums) {
    int[] newNums = new int[nums.length*2];
    for (int i = 0; i < nums.length; i++) {
        newNums[i] = newNums[i+nums.length] = nums[i];
    }
    return newNums;
  }

  public static void main(String[] args) {
    int[] orig = new int[]{1,2,3};
    for (int num : getConcatenation(orig)) {
      System.out.println(num);
    }
  }
}
