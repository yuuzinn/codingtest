import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[progresses.length];

        // 각 작업이 배포되기까지 걸리는 일수 계산
        for (int i = 0; i < progresses.length; i++) {
            arr[i] = countDays(progresses[i], speeds[i]);
        }

        int days = arr[0];
        int count = 1;

        // 배포 순서 확인
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= days) {
                // 현재 작업이 이전 작업보다 빨리 배포되는 경우?
                count++;
            } else {
                // 현재 작업이 이전 작업보다 늦게 배포되는 경우
                list.add(count);
                count = 1;
                days = arr[i];
            }
        }

        // 마지막에 남은 작업 배포 수 추가
        list.add(count);

        // List를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    static int countDays(int progress, int speed) {
        int answer = 0;
        while (progress < 100) {
            progress += speed;
            answer++;
        }
        return answer;
    }
}
