class Solution {
    public boolean checkIfExist(int[] arr) {
        int zeroCount = 0;
        for (int j : arr) {
            if (j == 0) zeroCount++;
            if (zeroCount == 2) return true;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (num != 0 && set.contains(num * 2)) {
                return true;
            }
        }
        return false;
    }
}