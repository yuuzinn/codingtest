import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); 
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int hIndexCandidate = Math.min(citations[i], n - i);
            if (hIndexCandidate > answer) {
                answer = hIndexCandidate;
            }
        }
        return answer;
    }
}
