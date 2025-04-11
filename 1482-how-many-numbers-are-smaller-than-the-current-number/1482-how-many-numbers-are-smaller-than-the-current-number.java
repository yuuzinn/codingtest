class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int[] prefixSum = new int[101];
        for (int i = 1; i < 101; i++) {
            prefixSum[i] = prefixSum[i - 1] + freq[i - 1];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefixSum[nums[i]];
        }
        return result;
    }
}