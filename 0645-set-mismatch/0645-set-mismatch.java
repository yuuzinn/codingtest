class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate = -1, missing = -1;
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
                break;
            }
        }
        
        if (nums[0] != 1) {
            missing = 1;
        }
        else if (nums[n - 1] != n) {
            missing = n;
        }
        else {
            for (int i = 0; i < n - 1; i++) {
                if (nums[i + 1] - nums[i] > 1) {
                    missing = nums[i] + 1;
                    break;
                }
            }
        }
        
        return new int[]{duplicate, missing};
    }
}