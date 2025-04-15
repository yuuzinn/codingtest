class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            // 양수 -> a
            // 음수 -> b
            int freq = map.get(a) - map.get(b);
            if (freq != 0) {
                return freq;
            }
            // 내림차순 (b가 더 큰 것이 기준)
            return b - a;
        });
        // 언박싱
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}