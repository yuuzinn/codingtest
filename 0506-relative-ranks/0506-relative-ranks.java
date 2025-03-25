class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] arr2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Map<Integer, String> map = new HashMap<>();
        Arrays.sort(arr2, Collections.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            if (i == 0) {
                map.put(arr2[i], "Gold Medal");
                continue;
            }
            if (i == 1) {
                map.put(arr2[i], "Silver Medal");
                continue;
            }
            if (i == 2) {
                map.put(arr2[i], "Bronze Medal");
                continue;
            }
            int num = i + 1;
            map.put(arr2[i], Integer.toString(num));
        }
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = map.get(score[i]);
        }
        return result;
    }
}