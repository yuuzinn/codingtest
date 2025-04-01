class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) list.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) list.add(nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}