class Solution {
   public int[] solution(int[] sequence, int k) {
        int size = sequence.length;
        int left = 0;
        int right = 0;
        int leftR = 0;
        int rightR = 0;
        int cnt = 1000001;
        int sum = 0;
        
        while(left<size && left <= right) {
            
            if(right < size && sum < k) {
                sum += sequence[right++];
            } else {
                sum -= sequence[left++];
            }
            
            if(sum == k) {
                if(cnt == right-left) continue;
                cnt = right-left;
                leftR = left;
                rightR = right-1;
            }
        }
        
        return new int[] { leftR, rightR };
    }
}