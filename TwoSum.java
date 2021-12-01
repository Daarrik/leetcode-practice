import java.util.HashMap;

class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int[] answer = new int[2];
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        answer[0] = map.get(target-nums[i]);
        answer[1] = i;
        return answer;
      }
      map.put(nums[i], i);
    }
    return answer;
  }
  public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] answer = twoSum(nums, target);
    for (int i : answer) {
      System.out.println(i);
    }
  }
}