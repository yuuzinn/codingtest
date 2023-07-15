class Solution {
    public int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] fibonacci = new int[n + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            fibonacci[i] %= 1234567;
        }

        return fibonacci[n];
    }
}
