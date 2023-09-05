class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) { // 대문자 알파벳인 경우
                char encryptedChar = (char) ('A' + (c - 'A' + n) % 26);
                answer.append(encryptedChar);
            } else if (Character.isLowerCase(c)) { // 소문자 알파벳인 경우
                char encryptedChar = (char) ('a' + (c - 'a' + n) % 26);
                answer.append(encryptedChar);
            } else { // 공백 문자인 경우
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
