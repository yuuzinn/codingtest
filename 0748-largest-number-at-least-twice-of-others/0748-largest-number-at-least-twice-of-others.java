class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int idx = 0;
        int[] nums2mag = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                idx = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == idx) continue;
            nums2mag[i] = 2 * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (max < nums2mag[i]) return -1;
        }
        
        return idx;
    }
}