import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        Integer index = 1;
        // i 번째를 돌면서 홀/짝 구분하기 -> 만약 홀수라면 -1개 (1개일 경우 0개로 처리) -> 짝수가 될 경우 /2
        for (int i = 1; i <= food.length -1; i++) {
            if (food[i] % 2 == 0) {
                for (int j = 0; j < food[i] / 2; j++) {
                    sb.append(index.toString());
                }
                index = index + 1;
            } else if (food[i] % 2 != 0) {
                if (food[i] == 1) {
                    index = index + 1;
                    continue;
                }
                for (int z = 0; z < food[i] / 2; z++) {
                    sb.append(index.toString());
                }
                index = index + 1;
            }
        }
        // StringBuilder로 합치기
        String back = sb.reverse().toString();
        sb.reverse();
        sb.append("0");
        String front = sb.toString();
        return front + back;
    }
}