import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        Arrays.fill(answer, -1);  // 초기값 -1로 설정

        int[] positions = new int[26];
        Arrays.fill(positions, -1);

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            int index = currentChar - 'a';

            if (positions[index] != -1) {
                answer[i] = i - positions[index];
            }

            positions[index] = i;
        }

        return answer;
    }
}
