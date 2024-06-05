import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answerList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        // score.length만큼 for문을 순회하면서 정렬 후 k번째의 수 answerList에 넣어주기
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            if (list.size() <= k) {
                answerList.add(list.get(list.size() - 1));
                continue;
            }
            answerList.add(list.get(k - 1));
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}