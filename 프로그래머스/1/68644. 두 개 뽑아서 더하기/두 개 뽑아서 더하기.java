import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        Object[] setArray = Arrays.stream(set.toArray()).sorted().toArray();
        for (int i = 0; i < setArray.length; i++) {
            answer[i] = (int) setArray[i];
        }
        return answer;
    }
}