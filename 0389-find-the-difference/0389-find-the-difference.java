class Solution {
    public char findTheDifference(String s, String t) {
        // 아스키 코드 값 더하기 (s, t 따로)
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        int result1 = 0;
        int result2 = 0;

        for (char c : charArray1) {
            result1 += c;
        }
        for (char c : charArray2) {
            result2 += c;
        }
        // 더한 값 t - s return
        return (char) (result2 - result1);
    }
}