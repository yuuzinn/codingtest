class Solution {
    public int countAsterisks(String s) {
		char[] charArray = s.toCharArray();
		int result = 0;
		boolean ignore = false;
		for (char c : charArray) {
			if (c == '|') {
				ignore = !ignore;
			} else if (c == '*' && !ignore) {
				result++;
			}
		}
		return result;
	}
}