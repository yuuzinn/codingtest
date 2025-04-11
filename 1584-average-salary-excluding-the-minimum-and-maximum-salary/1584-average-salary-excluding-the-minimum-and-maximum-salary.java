class Solution {
    public double average(int[] salary) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int j : salary) {
            if (minValue > j) minValue = j;
            if (maxValue < j) maxValue = j;
        }

        for (int j : salary) {
            if (maxValue != j && minValue != j) {
                sum += j;
                count++;
            }
        }
        return (double) sum / count;
    }
}