import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        // 몸무게 등장 횟수 계산
        for (int weight : weights) {
            countMap.merge(weight, 1, (v1, v2) -> v1 + 1);
        }

        // 등장 횟수를 이용하여 쌍의 수 계산
        for (int key : countMap.keySet()) {
            long currentCount = countMap.getOrDefault(key, 0);

            if (currentCount == 0) {
                continue;
            }

            answer += currentCount * (currentCount - 1) / 2;

            int tempCount = 0;

            // 4 * key / 3 이 존재하는지 확인
            if (4 * key % 3 == 0) {
                tempCount = countMap.getOrDefault((int) (4 * key / 3), 0);
                answer += currentCount * tempCount;
            }

            // 3 * key / 2 이 존재하는지 확인
            if (3 * key % 2 == 0) {
                tempCount = countMap.getOrDefault((int) (3 * key / 2), 0);
                answer += currentCount * tempCount;
            }

            // 2 * key 이 존재하는지 확인
            tempCount = countMap.getOrDefault((2 * key), 0);
            answer += currentCount * tempCount;
        }

        return answer;
    }
}
