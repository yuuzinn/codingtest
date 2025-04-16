class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int arrSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            arrSum += nums[i];
            list.add(nums[i]);
            total -= nums[i];
            if (arrSum > total) {
                break;
            }
        }
        return list;
    }
}