
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int priority : priorities) {
            list.add(priority);
        }

        int answer = 0;

        while (!list.isEmpty()) {
            int target = list.get(0);
            Integer getProcess = list.removeFirst();

            boolean hasHigherPriority = false;
            for (int i = 0; i < list.size(); i++) {
                if (target < list.get(i)) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                list.add(getProcess);
            } else {
                answer = answer + 1;

                if (getProcess.equals(target) && location == 0) {
                    return answer;
                }
            }

            if (location > 0) {
                location = location - 1;
            } else {
                location = list.size() - 1;
            }
        }

        return -1;
    }
}