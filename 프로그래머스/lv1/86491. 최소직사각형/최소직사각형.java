import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int max_v = 0;
        int max_h = 0;

        for(int i = 0;i < sizes.length; i++){
            
            // sizes[i][0] or sizes[i][1] 둘 중 큰 값이 v 에 들어감.
            int v = Math.max(sizes[i][0],sizes[i][1]); 
            // sizes[i][0] or sizes[i][1] 둘 중 작은 값이 h 에 들어감.
            int h = Math.min(sizes[i][0],sizes[i][1]); 
            
            max_v=Math.max(max_v,v); 
            
            max_h=Math.max(max_h,h);
        }
        return answer = max_v * max_h;
    }
}