class Solution {
    public int solution(int storey) {
        int count = 0;
        while (storey != 0) {
            int n = storey % 10;
            if (n < 5) {
                storey -= n;
                count += n;
            } else if (n == 5) {
                if ((storey / 10) % 10 < 5) {
                    storey -= 5;
                } else {
                    storey += 5;
                }
                count += 5;
            } else {
                storey += (10 - n);
                count += (10 - n);
            }
            storey = storey / 10;
        }

        return count;
    }
}