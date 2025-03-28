class Solution {
    public int pivotIndex(int[] nums) {
        int numSum = 0;
        int leftSum = 0;
        for (int num : nums) {
            numSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            numSum -= nums[i];
            if (numSum != leftSum) {
                leftSum += nums[i];
            } else {
                return i;
            }
        }
        return -1;
    }
}