class Solution {
    public int solution(int n, int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        int round = 1; 
        
        while (true) {
            if (min + 1 == max && min % 2 != 0) {
                break;
            }
            
            min = min % 2 == 0 ? min / 2 : min / 2 + 1;
            max = max % 2 == 0 ? max / 2 : max / 2 + 1;
            
            round++;
        }
        
        return round;
    }
}