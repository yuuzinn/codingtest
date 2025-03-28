class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        int delta = 0;
        for (int aliceSize : aliceSizes) {
            sumA += aliceSize;
        }
        for (int bobSize : bobSizes) {
            sumB += bobSize;
        }
        delta = (sumA - sumB) / 2;

        Set<Integer> set = new HashSet<>();
        
        for (int candy : bobSizes) {
            set.add(candy);
        }
        
        for (int x : aliceSizes) {
            int y = x - delta;
            if (set.contains(y)) {
                return new int[]{x, y}; 
            }
        }
        return new int[0];
    }
}