class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = 0;
        int left = 0;
        int right = tokens.length - 1;

        while (left <= right) {
            // face up
            if (power >= tokens[left]) {
               power -= tokens[left];
               score++;
               left++;
               maxScore = Math.max(maxScore, score);
            }
            // face down
            // up 할 수 없고 score 1 이상일 때 가장 큰 토큰 사용해 power 회복
            else if (score > 0 && left < right) {
                power += tokens[right];
                score--;
                right--;
            } else {
                break;
            }
        }
        return maxScore;
    }
}