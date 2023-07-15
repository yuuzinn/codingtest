import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {  
    static int cycleCount;
    
    public int[] solution(int n, String[] words) {
    int[] answer = new int[2];
    int samer = 0;
    List<String> list = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      if (i >= 1 && !isFollowUp(words[i - 1], words[i])) {
        samer = (i % n) + 1;
        answer[0] = samer;
        answer[1] = cycleCount + 1;
        return answer;
      }
      boolean contains = list.contains(words[i]);
      if (contains) {
        samer = (i % n) + 1;
        answer[0] = samer;
        answer[1] = cycleCount + 1;
        return answer;
      }
      list.add(words[i]);
      if ((i + 1) % n == 0) {
        cycleCount++;
      }
    }
    return answer;
  }
  public static boolean isFollowUp(String frontStr, String nextStr) {
    String back = frontStr.substring(frontStr.length() - 1);
    String front = nextStr.substring(0, 1);
    if (!back.equals(front)) {
      return false;
    }
    return true;
  }
}