import java.util.*;

class Solution {
    // d 배열의 요소들의 합이 budget보다 작거나 같아야 한다.
    // 그 합의 요소 개수가 가장 큰 수를 리턴해야함.
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}