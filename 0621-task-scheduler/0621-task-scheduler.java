class Solution {
    public int leastInterval(char[] tasks, int n) {
        int f_max = 0;
        int cal = 0;
        int count_max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (f_max < value) {
                f_max = value;
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (f_max == entry.getValue()) count_max++;
        }
        cal = (f_max - 1) * (n + 1) + count_max;
        return Math.max(tasks.length, cal);
    }
}