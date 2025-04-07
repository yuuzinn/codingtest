class Solution {
    public int longestStrChain(String[] words) {
        int result = 1;
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        Map<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            map.put(word, 1); // 자기 자신만 있을 경우
            for (int i = 0; i < word.length(); i++) {
                String subStr = word.substring(0, i) + word.substring(i + 1);
                if (map.containsKey(subStr)) {
                    map.put(word, Math.max(map.get(word), map.get(subStr) + 1));
                }
            }
            result = Math.max(result, map.get(word));
        }
        return result;
    }
}