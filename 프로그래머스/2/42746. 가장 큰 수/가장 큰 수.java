import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        // int 배열을 String 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 정렬 기준을 정의하여 배열 정렬
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // 두 수를 이어붙여 큰 순서로 정렬
                return (b + a).compareTo(a + b);
            }
        });

        // 0으로만 구성된 경우 예외 처리
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 정렬된 문자열을 이어붙여 return
        StringBuilder answer = new StringBuilder();
        for (String str : strNumbers) {
            answer.append(str);
        }

        return answer.toString();
    }
}
