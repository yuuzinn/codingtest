class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == max || num == second || num == third) {
                continue;
            }
            if (num > max) {
                third = second;
                second = max;
                max = num;
            }
            else if (num > second) {
                third = second;
                second = num;
            }
            else if (num > third) {
                third = num;
            }
        }

        return third == Long.MIN_VALUE ? (int) max : (int) third;
    }
}