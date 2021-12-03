public class Test {
  public static void main(String[] args) {
    int[] original = new int[]{1,2,3};
    for (int i : original) i = i * i;
    for (int i : original) System.out.println(i); 
  }
}
