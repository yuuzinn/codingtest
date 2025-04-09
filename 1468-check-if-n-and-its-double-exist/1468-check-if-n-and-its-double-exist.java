class Solution {
    public boolean checkIfExist(int[] arr) {
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }

        for (int x = -1000; x <= 1000; x++) {
            if (freq[x + 1000] > 0) {
                if (x == 0) {
                    if (freq[x + 1000] >= 2) return true;
                } else {
                    int dx = 2 * x;
                    if (dx >= -1000 && dx <= 1000 && freq[dx + 1000] > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}