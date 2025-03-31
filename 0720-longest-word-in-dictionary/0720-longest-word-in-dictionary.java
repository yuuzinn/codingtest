class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String ans = "";
        Set<String> valid = new HashSet<>();
        
        for (String word : words) {
            if (word.length() == 1 || valid.contains(word.substring(0, word.length() - 1))) {
                valid.add(word);
                if (word.length() > ans.length()) {
                    ans = word;
                }
            }
        }
        return ans;
    }
}