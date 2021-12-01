// O(n^2)

public class MostWater {
  public static int maxArea(int[] height) {
    int area = 0;
    for (int i = 0; i < height.length; i++) {
      for (int j = i+1; j < height.length; j++) {
        int shorterHeight = (height[i] > height[j] ? height[j] : height[i]);
        int tempArea = (j-i) * shorterHeight;
        if (tempArea > area) area = tempArea;
      }
    }
    return area;
  }

  public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(height));
  }
}
