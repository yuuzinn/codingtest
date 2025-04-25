class Solution {
    public int minOperations(String[] logs) {
		int depth = 0;
		for (String s : logs) {
			if (s.equals("../")) {
				depth = Integer.max(depth - 1, 0);
				continue;
			}
			if (s.equals("./")) continue;
			depth++;
		}
		return depth;
	}
}