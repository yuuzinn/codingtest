class Solution {
    public String decodeString(String s) {
		Stack<String> stack = new Stack<>();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			// 숫자일 경우
			if (Character.isDigit(charArray[i])) {
				int j = i;
				while (j < charArray.length && Character.isDigit(charArray[j])) {
					j++;
				}
				String number = s.substring(i, j);
				stack.push(number);
				i = j - 1;  
				continue;
			}
			// [ 일 경우
			if (charArray[i] == '[') {
				stack.push(String.valueOf(charArray[i]));
				continue;
			}
			// ] 일 경우
			if (charArray[i] == ']') {
				StringBuilder segment = new StringBuilder();
				while (!stack.peek().equals("[")) {
					segment.insert(0, stack.pop());
				}
				stack.pop();
				int k = Integer.parseInt(stack.pop());
				String expanded = segment.toString().repeat(k);
				stack.push(expanded);
				continue;
			}
			stack.push(String.valueOf(charArray[i]));
		}
		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			result.insert(0, stack.pop());
		}
		return result.toString();
	}
}