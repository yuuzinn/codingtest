class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str) ? true : false;
    }
}