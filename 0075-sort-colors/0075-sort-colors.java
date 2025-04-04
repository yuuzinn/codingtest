class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        
        while (mid <= right) {
            // 왼쪽이동
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
                // 오른쪽
            } else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else {
                mid++;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}