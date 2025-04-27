class Solution {
    public void reverseString(char[] s) {
		char[] result = new char[s.length];
		int idx = 0;
		for (int i = s.length - 1; i >= 0; i--) {
			result[idx] = s[i];
			idx++;
		}
        System.arraycopy(result, 0, s, 0, s.length);
	}
}