import java.util.*;

public class Solution {
     public int solution(int k) {
    int answer = 0;

    while(k != 0){
      if(k % 2 == 0){
        k /= 2;
      } else {
        k--;
        answer++;
      }
    }

    return answer;
  }
}