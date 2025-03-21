class Solution {
    public int majorityElement(int[] nums) {
        int ord = 1;
        while (ord != 0) {
            ord = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    ord++;
                }
            }
        }
        return nums[nums.length/2];
    }
    public void swap (int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}