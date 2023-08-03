import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pValue = Long.parseLong(p); 
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String substring = t.substring(i, i + p.length());
            long subValue = Long.parseLong(substring); 
            if (subValue <= pValue) {
                answer++;
            }
        }

        return answer;
    }
}
