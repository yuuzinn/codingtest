class Solution {
    
    static int count1;
    
    public int solution(int n) {
        int answer = 0;
        String nBinary = Integer.toBinaryString(n);
        for (int i = 0; i < nBinary.length(); i++) {
            String substring = nBinary.substring(i, i + 1);
            if (substring.equals("1")) {
                count1++;
            }
        }
        answer = isCountSame(n + 1);
        return answer;
    }
    public static int isCountSame(int n) {
        while (true) {
            for (int i = n; i <= 1_000_000; i++) {
                int i1 = toBinary(n);
                if (i1 == count1) {
                    return n;
                } else {
                    n++;
                }
            }
        }
    }
    public static int toBinary(int n) {
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            String substring = binary.substring(i, i + 1);
            if (substring.equals("1")) {
                count = count + 1;
            }
        }
        return count;
    }
}