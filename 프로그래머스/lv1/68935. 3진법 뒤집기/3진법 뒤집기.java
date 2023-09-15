class Solution {
    public int solution(int n) {
		int answer = 0;
		String s = Integer.toString(n, 3);
		String[] split = s.split("");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
			result += split[i];
		}
		return Integer.parseInt(result, 3);
	}
}