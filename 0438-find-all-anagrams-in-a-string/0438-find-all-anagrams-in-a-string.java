class Solution {
    public List<Integer> findAnagrams(String s, String p) {
		int[] window = new int[26];
		int[] hv = new int[26];
		List<Integer> answer = new ArrayList<>();
		int n = s.length();
		int m = p.length();
		char[] charArray = p.toCharArray();
		for (char c : charArray) {
			window[c - 'a']++;
		}
		for (int i = 0; i < m && i < n; i++) {
			hv[s.charAt(i) - 'a']++;
		}
		if (n >= m && Arrays.equals(window, hv)) {
			answer.add(0);
		}
		for (int i = m; i < n; i++) {
			hv[s.charAt(i) - 'a']++;              
			hv[s.charAt(i - m) - 'a']--;             
			if (Arrays.equals(window, hv)) {
				answer.add(i - m + 1);
			}
		}
		return answer;
	}
}