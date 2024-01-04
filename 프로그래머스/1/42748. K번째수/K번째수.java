import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            // x 번째 일 때 -> commands 의 요소 x, 0번째 - x, 1번째 - x, 2번째로 arr 배열 만들어서 가져오기
            int result = test(array, commands[i][0], commands[i][1], commands[i][2]);
            answer[i] = result;
        }
        return answer;
    }
    public static int test(int[] arr, int i, int j, int k) {
        int[] resultArr = new int[j - i + 1];
        // i번째부터 j번째까지 arr 자르기
        for (int l = 0; l < resultArr.length; l++) {
            resultArr[l] = arr[l + i - 1];
        }
        // arr 정렬하기
        Arrays.sort(resultArr);
        // k번째 수 가져와서 return
        return resultArr[k - 1];
    }
}