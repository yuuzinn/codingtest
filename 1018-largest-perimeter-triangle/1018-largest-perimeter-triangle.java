class Solution {
    public int largestPerimeter(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i+1] + arr[i+2] > arr[i]) {
                return arr[i] + arr[i+1] + arr[i+2];
            }
        }
        return 0;
    }
}