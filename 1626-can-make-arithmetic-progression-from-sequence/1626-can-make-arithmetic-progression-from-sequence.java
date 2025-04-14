class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2) return true;
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i + 1] - arr[i]);
        }
        int absVal = sum / (arr.length - 1);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != absVal) return false;
        }
        return true;
    }
}