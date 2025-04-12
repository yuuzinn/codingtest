class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = n * 5 / 100;
        int sum = 0;
        for (int i = count; i < n - count; i++) {
            sum += arr[i];
        }
        return (double) sum / (n - 2 * count);
    }
}