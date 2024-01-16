class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] order = {781, 156, 31, 6, 1}; 

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            switch (c) {
                case 'A':
                    answer += 0 * order[i];
                    break;
                case 'E':
                    answer += 1 * order[i];
                    break;
                case 'I':
                    answer += 2 * order[i];
                    break;
                case 'O':
                    answer += 3 * order[i];
                    break;
                case 'U':
                    answer += 4 * order[i];
                    break;
            }
        }

        return answer + word.length(); 
    }
}
