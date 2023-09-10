class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gc = gcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / gc;
        for (int i = 0; i < arr.length; i++) {
            gc = gcd(answer, arr[i]);
            answer = (answer * arr[i]) / gc;
        }
        return answer;
    }
    public static int gcd(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        }
        return gcd(b, r);
    }
}