import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int sum = 0;
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        for (int val : list) {
            if (sum + val >= k) {
                answer++;
                break;
            } else {
                sum += val;
                answer++;
            }
        }
        return answer;
    }
}