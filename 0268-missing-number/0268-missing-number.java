class Solution {
    public int missingNumber(int[] nums) {
        int nSum = 0;
        int arrSum = 0;
        for (int i = 1; i <= nums.length; i++) {
            nSum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            arrSum += nums[i];
        }
        return nSum - arrSum;
    }
}