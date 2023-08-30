import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> nums = new ArrayList<>();
        
        // 인덱스 표시
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        
        k--;
        
        // 순열 돌리기
        for (int i = 0; i < n; i++) {
            // n-1!로 나눈 값을 구해서 해당 인덱스의 요소 선택
            long factorial = factorial(n - 1 - i);
            int index = (int) (k / factorial);
            answer[i] = nums.get(index);
            
            // 선택된 요소 제거
            nums.remove(index);
            
            // 다음 순번으로 넘어가기 위해 k 갱신
            k %= factorial;
        }
        
        return answer;
    }
    
    // 팩토리얼 
    private long factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
