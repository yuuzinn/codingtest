class Solution {
  static int zeroCount = 0;
  static int binaryCount = 0;
    public int[] solution(String s) {
    int[] answer = new int[2];
    cycle(s);
    answer[0] = binaryCount;
    answer[1] = zeroCount;
    return answer;
  }
  public static void cycle(String s) {
    if (s.length() == 1) {
      return;
    }

    int i = toBinaryLength(s);
    String binaryString = toBinaryString(i);
    cycle(binaryString);
  }
  public static int toBinaryLength(String s) {
    String result = "";
    String zero = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.substring(i, i + 1).equals("1")) {
        String substring = s.substring(i, i + 1);
        result += substring;
        continue;
      }
      result += zero;
      zeroCount = zeroCount + 1;
    }
    binaryCount = binaryCount + 1;
    return result.length();
  }
  public static String toBinaryString(int n) {
    return Integer.toBinaryString(n);
  }
}